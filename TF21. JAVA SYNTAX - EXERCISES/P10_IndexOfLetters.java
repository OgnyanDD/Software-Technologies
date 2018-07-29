import java.util.Scanner;

public class P10_IndexOfLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String letters = in.nextLine();

        for (int i = 0; i < letters.length(); i++) {
            System.out.println(letters.charAt(i) + " -> " + (letters.charAt(i) - 97));
        }
    }
}