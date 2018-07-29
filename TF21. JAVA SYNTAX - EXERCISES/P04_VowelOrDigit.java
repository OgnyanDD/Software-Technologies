import java.util.Scanner;

public class P04_VowelOrDigit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        if (input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u")) {
            System.out.println("vowel");
        } else if (input.matches("\\d")) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}