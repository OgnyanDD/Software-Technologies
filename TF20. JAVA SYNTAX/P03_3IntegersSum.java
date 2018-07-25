import java.util.Arrays;
import java.util.Scanner;

public class P03_3IntegersSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] numbers = Arrays.stream(in.nextLine()
                .split(" "))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();

        int num1 = numbers[0];
        int num2 = numbers[1];
        int num3 = numbers[2];

        if (!checkNums(num1, num2, num3) && !checkNums(num3, num1, num2) && !checkNums(num2, num3, num1)) {
            System.out.println("No");
        }
    }

    static boolean checkNums(int num1, int num2, int sum) {
        if (num1 + num2 != sum) {
            return false;
        }
        if (num1 <= num2) {
            System.out.printf("%d + %d = %d%n", num1, num2, sum);
        } else {
            System.out.printf("%d + %d = %d%n", num2, num1, sum);
        }
        return true;
    }
}
