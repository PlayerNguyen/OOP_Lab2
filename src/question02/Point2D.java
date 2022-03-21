package question02;

import java.util.Scanner;

public class Point2D {

    public int x;
    public int y;

    public Point2D() {
    }

    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input x and y value: ");
        this.x = scanner.nextInt();
        this.y = scanner.nextInt();
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isOrigin() {
        return this.x == 0 && this.y == 0;
    }

    public double distance(Point2D p) {
        return Math.sqrt(
                Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)
        );
    }

    public static double distance(Point2D p1, Point2D p2) {
        return p1.distance(p2);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
