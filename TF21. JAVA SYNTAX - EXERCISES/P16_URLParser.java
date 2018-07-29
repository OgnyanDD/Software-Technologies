import java.util.Scanner;

public class P16_URLParser {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        if (input.contains("://")) {
            String[] port = input.split("://");
            System.out.println("[protocol] = " + "\"" + port[0] + "\"");
            if (!port[1].equals("")) {
                String[] serv = port[1].split("/+?");
                System.out.println("[server] = " + "\"" + serv[0] + "\"");
                if (serv.length != 1) {
                    String[] res = port[1].split("^([^\\/]+)\\/");
                    System.out.println("[resource] = " + "\"" + res[1] + "\"");
                } else {
                    System.out.println("[resource] = \"\"");
                }
            }
        } else {
            System.out.println("[protocol] = \"\"");
            if (input.contains("/")) {
                String[] serv = input.split("/+?");
                System.out.println("[server] = " + "\"" + serv[0] + "\"");
                if (serv.length != 1) {
                    String[] res = input.split("^([^\\/]+)\\/");
                    System.out.println("[resource] = " + "\"" + res[1] + "\"");
                }
            } else {
                System.out.println("[server] = " + "\"" + input + "\"");
                System.out.println("[resource] = \"\"");
            }
        }
    }
}