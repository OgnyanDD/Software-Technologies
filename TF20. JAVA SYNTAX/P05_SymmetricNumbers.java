import java.util.ArrayList;
import java.util.Scanner;

public class P05_SymmetricNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> symmetricNumbers = new ArrayList<>();

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (IsSymmetric("" + i)) {
                symmetricNumbers.add(i);
            }
        }

        for (Integer symmetricNumber : symmetricNumbers) {
            System.out.printf("%d ", symmetricNumber);
        }
    }

    private static boolean IsSymmetric(String numberAsString) {
        for (int i = 0; i <= numberAsString.length() / 2; i++) {
            if (numberAsString.charAt(i) != numberAsString.charAt(numberAsString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
