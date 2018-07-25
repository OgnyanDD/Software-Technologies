import java.util.Scanner;

public class P04_SumNIntegers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int sum = 0;

        for (int i = 0; i < n ; i++) {

            int number = Integer.parseInt(in.nextLine());

            sum += number;
        }

        System.out.printf("Sum = %d", sum);
    }
}