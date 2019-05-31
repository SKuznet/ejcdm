package lesson12.strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    void getInfo() throws Exception {
        System.out.println("I am MallardDuck");
    }
}
