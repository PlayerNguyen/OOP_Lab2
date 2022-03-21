package question04;

public class Point2D {
    public int x;
    public int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void add(Point2D point) {
        this.x += point.x;
        this.y += point.y;
    }

    public void add(int x, int y) {
        this.add(new Point2D(x, y));
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
