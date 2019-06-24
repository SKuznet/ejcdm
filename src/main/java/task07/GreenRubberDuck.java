package task07;

class GreenRubberDuck extends Duck {
    GreenRubberDuck() {
        flyBehavior = new NoFly();
        landBehavior=new LandRun();
        landAction= new LandKillDog();
    }

    @Override
    void getInfo() {
        System.out.println("I rubble Duck");
    }
}
