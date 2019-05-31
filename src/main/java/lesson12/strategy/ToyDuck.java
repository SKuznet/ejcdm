package lesson12.strategy;

public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior = new FlyNoWay();
    }

    @Override
    void getInfo() {
        System.out.println("I am toy duck kva kva");
    }
}
