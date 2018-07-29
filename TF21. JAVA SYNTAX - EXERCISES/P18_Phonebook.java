import java.util.LinkedHashMap;
import java.util.Scanner;

public class P18_Phonebook {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String phoneData = in.nextLine();

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        while (!phoneData.equals("END")) {
            String[] phoneInfo = phoneData.split(" ");
            String command = phoneInfo[0];
            String name = phoneInfo[1];

            if (command.equals("A")) {
                String number = phoneInfo[2];
                if (!phonebook.containsKey(name)) {
                    phonebook.put(name, number);
                }
                phonebook.put(name, number);
            } else if (command.equals("S")) {
                if (!phonebook.containsKey(name)) {
                    System.out.printf("Contact %s does not exist.", name);
                    System.out.println();
                } else {
                    System.out.println(name + " -> " + phonebook.get(name));
                }
            }
            phoneData = in.nextLine();
        }
    }
}