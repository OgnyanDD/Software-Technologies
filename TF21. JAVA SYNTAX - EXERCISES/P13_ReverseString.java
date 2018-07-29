import java.util.Scanner;

public class P13_ReverseString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println(reverse);
    }
}