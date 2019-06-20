package lesson18;

import java.util.concurrent.TimeUnit;

public class ATM {
    // american dollars!!!
    static int money = 1_000_000_000;

    static synchronized void getMoney(int amount) { // toilet
        if(amount <= money) {
            try {
                TimeUnit.NANOSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money-=amount;
            System.err.println("All Ok. New amount: " + money);
        } else {
            System.err.println("Not enough money");
        }
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Mike");
                getMoney(500_000_000);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Jack");
                getMoney(500_000_000);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("John");
                getMoney(500_000_000);
            }
        }).start();
    }
}
