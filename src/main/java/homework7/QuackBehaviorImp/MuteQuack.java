package homework7.QuackBehaviorImp;

import homework7.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("*Tryes to make silent noise*");
    }
}
