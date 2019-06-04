package homework7.QuackBehaviorImp;

import homework7.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Brr-brr-brr");
    }
}
