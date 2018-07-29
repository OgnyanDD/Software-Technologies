import java.util.Scanner;

public class P06_CompareCharArrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String firstArray = in.nextLine();
        String secondArray = in.nextLine();

        int equals = firstArray.compareTo(secondArray);

        if (equals < 0) {
            System.out.println(firstArray.replaceAll("\\W", ""));
            System.out.println(secondArray.replaceAll("\\W", ""));
        } else {
            System.out.println(secondArray.replaceAll("\\W", ""));
            System.out.println(firstArray.replaceAll("\\W", ""));
        }
    }
}