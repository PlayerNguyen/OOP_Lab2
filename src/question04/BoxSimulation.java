package question04;

public class BoxSimulation {

    private static final int BOX_WIDTH = 16;
    private static final int BOX_HEIGHT = 6;
    private static final int INIT_PARTICLE_NUMBER = 10;
    private static final int PARTICLE_MOVEMENT_STEPS = 1;

    public static void main(String[] args) {
        int width = BOX_WIDTH;
        int height = BOX_HEIGHT;

        Box box = Box.createBox(width, height);
        // Generate random particle
        for (int i = 0; i < INIT_PARTICLE_NUMBER; i++) {
            Point2D initialPoint = new Point2D(
                    MathHelper.randomInt(0, width - 1),
                    MathHelper.randomInt(0, height - 1)
            );
            Particle particle = new Particle(box,
                    initialPoint,
                    ParticleDirectionEnum.getRandomDirection()
            );
            System.out.println("Add initial particle: " + particle);
            box.addParticle(particle);
        }
        // Update as step
        box.update(PARTICLE_MOVEMENT_STEPS);

        // Visualize
        box.visualize();
    }


}
