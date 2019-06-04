package homework7;

import homework7.FlyBehaviorImp.FlyWithWings;
import homework7.QuackBehaviorImp.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a redhead duck.");
    }
}
