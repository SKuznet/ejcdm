package task07;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I don't fly");
    }
}
