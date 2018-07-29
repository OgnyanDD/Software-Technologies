import java.util.Scanner;

public class P03_ReverseCharacters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char firstChar = in.nextLine().charAt(0);
        char secondChar = in.nextLine().charAt(0);
        char thirdChar = in.nextLine().charAt(0);

        System.out.printf("%c%c%c", thirdChar, secondChar, firstChar);
    }
}