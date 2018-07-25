import java.util.Scanner;

public class P02_SumTwoNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double result = 0;

        for (int i = 0; i < 2; i++) {

            double number = Double.parseDouble(in.nextLine());
            result += number;
        }
        System.out.printf("%.2f", result);
    }
}