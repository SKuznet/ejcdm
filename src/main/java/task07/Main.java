package task07;

public class Main {
    public static void main(String[] args) throws Exception {
        Duck duck1 = new GreenDuck();
        Duck duck2 = new GreenRubberDuck();

        duck1.getInfo();
        duck1.performFly();
        duck1.performWalk();
        duck1.performActionInLand();

        System.out.println();

        duck2.getInfo();
        duck2.performFly();
        duck2.performWalk();
        duck2.performActionInLand();
    }
}
