package lesson12.strategy;

public class Main {

    public static void main(String[] args) throws Exception {
        Duck duck1 = new RedHatDuck();
        duck1.getInfo();

        Duck duck2 = new MallardDuck();
        duck2.performFly();

        Duck duck3 = new ToyDuck();
        duck3.performFly();
    }
}
