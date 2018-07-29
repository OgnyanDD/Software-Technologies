import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P17_ChangeToUppercase {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String pattern = "<upcase>(.+?)</upcase>";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);

        for (int i = 0; i < text.length(); i++) {
            if (m.find()) {
                text = text.replace(m.group(), m.group(1).toUpperCase());
            }
        }
        System.out.println(text);
    }
}