import java.util.Scanner;

public class P14_FitStringIn20Chars {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String text = in.nextLine();

        if (text.length() < 20) {
            StringBuilder padd = new StringBuilder(text);
            while (padd.length() != 20) {
                padd.append('*');
            }
            System.out.println(padd);
        } else {
            text = text.substring(0, 20);
            System.out.println(text);
        }
    }
}