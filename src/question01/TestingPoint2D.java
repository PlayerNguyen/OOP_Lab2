package question01;

import java.util.Random;

public class TestingPoint2D {

    public static void main(String[] args) {

        Point2D p1 = new Point2D();
        System.out.println("The initial value of p1 is: " + p1);
        System.out.println("Is p1 at the origin? " + p1.isOrigin());
        System.out.println("Asking user for change value for p1: ");
        p1.input();

        Point2D p2 = new Point2D(new Random().nextInt(100), new Random().nextInt(100));
        System.out.println("The value of p2 is: " + p2);

        Point2D p3 = new Point2D(p2);
        System.out.println("The value of p3 is: " + p3);
        System.out.println("First way to calculate distance between p1 and p2:" + p1.distance(p2));
        System.out.println("Second way to calculate distance between p1 and p2:" + Point2D.distance(p1, p2));
        System.out.println("First way to calculate distance between p2 and p3:" + p3.distance(p3));
        System.out.println("Second way to calculate distance between p2 and p3:" + Point2D.distance(p2, p3));
    }

}
