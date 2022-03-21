package question04;

public class Particle {

    public Point2D position;
    public ParticleDirectionEnum direction;

    public Particle(Box box, Point2D position, ParticleDirectionEnum direction) {
        if (position.x < 0 || position.x > box.width) {
            System.out.println("The position of x must be in range 0 <= x <= box width");
        }
        if (position.y < 0 || position.y > box.height) {
            System.out.println("The position of y must be in range 0 <= y <= box height");
        }
        this.position = position;
        this.direction = direction;
    }

    public Particle(Box box, int x, int y, ParticleDirectionEnum direction) {

        if (x < 0 || x > box.width) {
            System.out.println("The position of x must be in range 0 <= x <= box width");
        }
        if (y < 0 || y > box.height) {
            System.out.println("The position of y must be in range 0 <= y <= box height");
        }
        this.position = new Point2D(x, y);
        this.direction = direction;
    }

    public Point2D getPosition() {
        return position;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public ParticleDirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(ParticleDirectionEnum direction) {
        this.direction = direction;
    }

    public void move() {
        if (this.direction == null) {
            // Won't move if the direction is null
            return;
        }
        this.position.add(this.direction.getMovementPosition());
    }

    @Override
    public String toString() {
        return "Particle{" +
                "position=" + position +
                ", direction=" + direction.getShortHandName() +
                '}';
    }
}
