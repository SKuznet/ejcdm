package task07;

abstract class Duck {
    FlyBehavior flyBehavior;
    LandBehavior landBehavior;
    LandAction landAction;

    void performFly() {
        flyBehavior.fly();
    }

    void performWalk() {
        landBehavior.walk();
    }

    void performActionInLand() {
        landAction.action();
    }

    abstract void getInfo() throws Exception;
}