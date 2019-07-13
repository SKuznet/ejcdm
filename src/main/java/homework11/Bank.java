package homework11;

public class Bank {
    private static int money = 1_000_000_000;

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Bank.money = money;
    }
}
