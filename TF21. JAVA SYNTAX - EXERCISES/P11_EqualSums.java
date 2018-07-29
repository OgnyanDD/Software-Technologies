import java.util.Arrays;
import java.util.Scanner;

public class P11_EqualSums {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int array[] = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int index = 0;
        boolean isEqual = false;

        for (int i = 0; i < array.length; i++) {
            int rightSum = 0;
            int leftSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                rightSum += array[j];
            }

            if (leftSum == rightSum) {
                isEqual = true;
                index = i;
            }
        }

        if (isEqual) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}