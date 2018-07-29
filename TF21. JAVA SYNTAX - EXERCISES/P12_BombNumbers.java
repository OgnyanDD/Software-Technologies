import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P12_BombNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Integer> area = Arrays
                .stream(in.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] bombProps = Arrays
                .stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bomb = bombProps[0];
        int bombPower = bombProps[1];

        while (area.contains(bomb)) {
            int position = area.indexOf(bomb);
            int start = position - bombPower;
            int end = position + 1 + bombPower;

            if (position - bombPower < 0 && position + bombPower > area.size())
                area.clear();
            else if (position - bombPower < 0)
                area.subList(0, 1 + bombPower + position).clear();
            else if (end > area.size())
                area.subList(start, area.size()).clear();
            else {
                area.subList(start, end).clear();
            }
        }
        int sum = area.stream().mapToInt(i -> i).sum();

        System.out.println(sum);
    }
}