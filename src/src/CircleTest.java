package src;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        Random random = new Random();
        int number = random.nextInt(101);

        System.out.println("random" + number);
    }
}
