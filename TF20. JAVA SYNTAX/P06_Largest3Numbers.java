import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P06_Largest3Numbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] array = Arrays.stream(in.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(i -> i)
                .toArray();

        for (Integer item : array) {
            System.out.println(item);
        }
    }
}