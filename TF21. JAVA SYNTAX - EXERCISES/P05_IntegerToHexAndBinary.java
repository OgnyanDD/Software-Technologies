import java.util.Scanner;

public class P05_IntegerToHexAndBinary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int decNum = Integer.parseInt(in.nextLine());

        System.out.println(Integer.toHexString(decNum).toUpperCase());
        System.out.println(Integer.toBinaryString(decNum));
    }
}