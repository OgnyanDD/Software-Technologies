import java.util.Scanner;

public class P02_BooleanVariable {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        if (input.equals("True")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}