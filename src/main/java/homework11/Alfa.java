package homework11;

import java.util.concurrent.TimeUnit;

public class Alfa implements ATM {
    private static int money;
    Bank bank;

    Alfa(Bank bank){
        money = 250_000_000;
        this.bank = bank;
    }

    private final Object key = new Object();

    public void getMoney(int amount){
        synchronized (key) {
            if (amount <= money) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                money -= amount;
                System.err.println("All Ok. You got " + amount + ". Money left " + money);
            } else {
                System.err.println("Not enough money");
            }
        }
    }

    public void addMoney(int amount){
        synchronized (key) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money += amount;
            System.err.println("All Ok. You add " + amount + ". Money left " + money);
        }
    }

    public void getBalance(){
        synchronized (key) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Balance is " + money);
        }
    }
}
