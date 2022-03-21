package question02;

public class Triangle {

    private Point2D p1;
    private Point2D p2;
    private Point2D p3;

    public Triangle(Point2D p1, Point2D p2, Point2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double perimeter() {
        return (p1.distance(p2) + p2.distance(p3) + p3.distance(p1));
    }

    public double area() {

        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);


        double semiPerimeter = ((this.perimeter()) / 2);

        return Math.sqrt(
                semiPerimeter
                        * (semiPerimeter - a)
                        * (semiPerimeter - b)
                        * (semiPerimeter - c)
        );
    }

}
