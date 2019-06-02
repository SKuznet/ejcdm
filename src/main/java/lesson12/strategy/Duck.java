package lesson12.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    abstract void getInfo() throws Exception;
}
