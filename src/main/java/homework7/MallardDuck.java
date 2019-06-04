package homework7;

import homework7.FlyBehaviorImp.FlyWithWings;
import homework7.QuackBehaviorImp.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck.");
    }
}
