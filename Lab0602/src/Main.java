import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(0, 0, 100, 100));
        rectangles.add(new Rectangle(40, 60, 50, 70));

        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(100, 200, 20 ));
        circles.add(new Circle(40, 60, 20));

        while (true) {
            System.out.print("x: ");
            int x = sc.nextInt();

            System.out.print("y: ");
            int y = sc.nextInt();

            if (x == -1 && y == -1) {
                break;
            }

            for (Rectangle rectangle : rectangles) {
                if (rectangle.contains(x, y)) {
                    System.out.println(rectangle);
                }

            }
            for (Circle circle : circles) {
                if (circle.contains(x, y)) {
                    System.out.println(circle);
                }

            }

        }
    }
}