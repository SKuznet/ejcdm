package homework8;

public class Ball {
    private int id;
    private int centerOfMass;

    public int getId() {
        return id;
    }

    public int getCenterOfMass() {
        return centerOfMass;
    }

    Ball(int id, int centerOfMass) {
        this.id = id;
        this.centerOfMass = centerOfMass;
    }
}
