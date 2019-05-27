package lesson10;

public interface CatService {
    long defaultServiceTime = 10;

    public abstract void washHands();
    void sayHello();
    void cookPizza();
    void packPizza();
    void sendPizzaToCustomer();
}
