package task07;

class GreenDuck extends Duck {
    GreenDuck() {
        flyBehavior = new FlyWithWings();
        landBehavior=new LandWalk();
        landAction= new LandKiller();
    }

    @Override
    void getInfo() {
        System.out.println("I green Duck ");
    }
}
