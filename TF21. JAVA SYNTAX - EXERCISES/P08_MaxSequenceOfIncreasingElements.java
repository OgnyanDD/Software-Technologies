import java.util.Arrays;
import java.util.Scanner;

public class P08_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int array[] = Arrays
                .stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .mapToInt(i -> i)
                .toArray();

        int count = 0;
        int bestCount = 0;
        int bestIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
                if (count > bestCount) {
                    bestCount = count;
                    bestIndex = i - count;
                }
            } else {
                count = 0;
            }
        }

        for (int i = 1; i <= bestCount + 1; i++) {
            System.out.printf("%d ", array[i + bestIndex]);
        }
    }
}