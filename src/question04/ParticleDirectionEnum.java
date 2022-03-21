package question04;

import java.util.List;

public enum ParticleDirectionEnum {

    NORTH("N", new Point2D(0, -1)),
    NORTH_EAST("NE", new Point2D(1, -1)),
    EAST("E", new Point2D(1, 0)),
    SOUTH("S", new Point2D(0, 1)),
    SOUTH_EAST("SE", new Point2D(1, 1)),
    SOUTH_WEST("SW", new Point2D(-1, 1)),
    WEST("W", new Point2D(-1, 0)),
    NORTH_WEST("NW", new Point2D(-1, -1));

    private final String shorthandName;
    private final Point2D movementPosition;

    ParticleDirectionEnum(String shorthandName, Point2D p) {
        this.shorthandName = shorthandName;
        this.movementPosition = p;
    }

    public String getShortHandName() {
        return shorthandName;
    }

    public Point2D getMovementPosition() {
        return movementPosition;
    }

    @Override
    public String toString() {
        return "ParticleDirectionEnum{" +
                "shorthandName='" + shorthandName + '\'' +
                ", movementPosition=" + movementPosition +
                '}';
    }

    public static ParticleDirectionEnum getRandomDirection() {
        ArbitraryRandomize<ParticleDirectionEnum> pa =
                new ArbitraryRandomize<>(List.of(ParticleDirectionEnum.values()));
        return pa.random();
    }
}
