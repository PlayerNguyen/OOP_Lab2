package question04;

import java.util.ArrayList;
import java.util.Stack;

public class Box {
    public final int width;
    public final int height;
    private final ArrayList<Particle> particles = new ArrayList<>();

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public static Box createBox(int width, int height) {
        return new Box(width, height);
    }

    public void update(int stepNumber) {

        Stack<Particle> addParticles = new Stack<>();

        for (int i = 0; i < stepNumber; i++) {
            for (Particle particle : particles) {
                particle.move();
                for (Particle particle1 : particles) {
                    if (particle1.position.distance(particle.position) <= 0) {
                        Point2D newPos = new Point2D(
                                MathHelper.randomInt(1, width - 1),
                                MathHelper.randomInt(1, height - 1)
                        );
                        System.out.println("Collision in " + particle1.position + ", generating new " +
                                "particle at position " +  newPos);
                        // Generate new particle in random
                        addParticles.push(new Particle(
                                this,
                                newPos,
//                                ParticleDirectionEnum.getRandomDirection()
                                null
                        ));
                    }
                }
            }
        }

        this.particles.addAll(addParticles);

    }

    public ArrayList<Particle> getParticles() {
        return particles;
    }

    public void addParticle(Particle particle) {
        this.particles.add(particle);
    }

    public void visualize() {

        char[][] arr = new char[height][width];
        boolean[][] filled = new boolean[height][width];
        for (int y = 0; y < height; y++)
            for (int x = 0; x < width; x++) {
                arr[y][x] = ' ';
                filled[y][x] = false;
            }


        // Horizontal bar
        System.out.print(" ");
        for (int x = 0; x < width; x++) {
            System.out.print("-");
        }
        System.out.print(" ");
        System.out.println();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                for (Particle particle : this.particles) {
                    if (!filled[y][x]) {
                        if (particle.position.x == x && particle.position.y == y) {
                            arr[y][x] = '*';
                            filled[y][x] = true;
                        }
                    }
                }

            }
        }

        for (int y = 0; y < height; y++) {
            System.out.print("|");
            for (int x = 0; x < width; x++) {
                System.out.print(arr[y][x]);
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print(" ");
        for (int x = 0; x < width; x++) {
            System.out.print("-");
        }
        System.out.print(" ");
    }
}
