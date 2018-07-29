import java.util.Scanner;

public class P01_VariableInHexFormat {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String hexNum = in.nextLine();

        System.out.println(Integer.parseInt(hexNum, 16));
    }
}