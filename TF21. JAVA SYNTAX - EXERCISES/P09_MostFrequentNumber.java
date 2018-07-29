import java.util.Arrays;
import java.util.Scanner;

public class P09_MostFrequentNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int array[] = Arrays
                .stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .mapToInt(i -> i)
                .toArray();

        int bestCount = 0;
        int specialNum = 0;

        for (int number : array) {
            int count = 0;
            for (int searchedNum : array) {
                if (searchedNum == number) {
                    count++;
                }
            }
            if (count > bestCount) {
                bestCount = count;
                specialNum = number;
            }
        }

        System.out.println(specialNum);
    }
}