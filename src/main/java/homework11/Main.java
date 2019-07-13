package homework11;

public class Main {
    private static Bank bank = new Bank();

    public static void main(String[] args) {
        ATM sber = new FactoryATM().create("Sber", bank);
        ATM raif = new FactoryATM().create("Raif", bank);
        ATM alfa = new FactoryATM().create("Alfa", bank);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Sber");
               sber.getMoney(1000);
               sber.getAtmBalance();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Raif");
                raif.getMoney(500_000_000);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Alfa");
                alfa.addMoney(10000000);
                alfa.getBankBalance();
            }
        }).start();
    }
}
