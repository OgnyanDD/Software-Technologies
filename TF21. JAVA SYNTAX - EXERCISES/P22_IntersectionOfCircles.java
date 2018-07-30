import java.util.Arrays;
import java.util.Scanner;

public class P22_IntersectionOfCircles {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] firstCircle = Arrays.stream(in.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondCircle = Arrays.stream(in.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Point centerC1 = new Point(firstCircle[0], firstCircle[1]);
        Circle c1 = new Circle(centerC1, firstCircle[2]);
        Point centerC2 = new Point(secondCircle[0], secondCircle[1]);
        Circle c2 = new Circle(centerC2, secondCircle[2]);

        boolean intersect = Intersect(c1, c2);
        if (intersect) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int getX() {
            return x;
        }

        int getY() {
            return y;
        }
    }

    private static boolean Intersect(Circle c1, Circle c2) {

        boolean check = false;

        double length = Math.sqrt(Math.pow(c1.getCenter().getX() - c2.getCenter().getX(), 2) +
                Math.pow(c1.getCenter().getY() - c2.getCenter().getY(), 2));
        if (length <= c1.getRadius() + c2.getRadius()) {
            check = true;
        }
        return check;
    }

    private static class Circle {
        private Point center;
        private int radius;

        Circle(Point center, int radius) {
            this.center = center;
            this.radius = radius;
        }

        Point getCenter() {
            return center;
        }

        int getRadius() {
            return radius;
        }
    }
}