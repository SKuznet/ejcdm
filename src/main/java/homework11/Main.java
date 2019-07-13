package homework11;

public class Main {
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Mike");
                //bank.getMoney(500_000_000);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Misha");
                //bank.getMoney(500_000_000);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Masha");
                //bank.getMoney(500_000_000);
            }
        }).start();
    }
}
