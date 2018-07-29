import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P19_PhonebookUpgrade {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String phoneData = in.nextLine();

        TreeMap<String, String> phonebook = new TreeMap<>();

        while (!phoneData.equals("END")) {

            if (phoneData.equals("ListAll")) {
                for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
                phoneData = in.nextLine();
                continue;
            }
            String[] array = phoneData.split(" ");
            String command = array[0];
            String name = array[1];

            if (command.equals("A")) {
                String number = array[2];
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