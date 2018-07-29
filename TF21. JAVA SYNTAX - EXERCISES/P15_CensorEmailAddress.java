import java.util.Scanner;

public class P15_CensorEmailAddress {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String email = in.nextLine();
        String[] emailData = email.split("@");
        String text = in.nextLine();
        StringBuilder replacement = new StringBuilder();

        for (int i = 0; i < emailData[0].length(); i++) {
            replacement.append("*");
        }
        replacement.append("@");
        replacement.append(emailData[1]);

        System.out.println(text.replaceAll(email, replacement.toString()));
    }
}