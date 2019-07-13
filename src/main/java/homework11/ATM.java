package homework11;

import java.util.concurrent.TimeUnit;

public interface ATM {
    void getMoney(int amount);
    void addMoney(int amount);
    void getBalance();
}
