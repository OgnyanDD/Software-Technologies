import java.util.*;
import java.util.stream.Collectors;

public class P23_AverageGrades {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int studentsCount = Integer.parseInt(in.nextLine());
        List<Student> students = new ArrayList<>();

        for (int index = 0; index < studentsCount; index++) {

            String[] studentsTokens = in.nextLine().split(" ");

            String name = studentsTokens[0];

            List<Double> grades = Arrays.stream(studentsTokens)
                    .skip(1)
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());

            Student student = new Student(name, grades);

            students.add(student);
        }

        students.stream()
                .filter(s -> s.getAverageGrade() >= 5.00)
                .sorted((a, b) -> {
                    int comparisonResult = a.getName().compareTo(b.getName());

                    if (comparisonResult == 0) {

                        comparisonResult = Double.compare(
                                b.getAverageGrade(), a.getAverageGrade());
                    }

                    return comparisonResult;
                })
                .forEach(s -> System.out.printf(
                        "%s -> %.2f%n", s.getName(), s.getAverageGrade()));
    }

    public static class Student {

        private String name;
        private List<Double> grades;

        Student(String name, List<Double> grades) {

            this.name = name;
            this.grades = grades;
        }

        String getName() {
            return name;
        }

        Double getAverageGrade() {
            return this.grades
                    .stream()
                    .mapToDouble(grades1 -> grades1)
                    .average()
                    .getAsDouble();
        }
    }
}