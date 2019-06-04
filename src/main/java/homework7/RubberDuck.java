package homework7;

import homework7.FlyBehaviorImp.FlyNoWay;
import homework7.QuackBehaviorImp.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rudder duck");
    }
}
