package homework11;

import java.util.concurrent.TimeUnit;

public interface ATM {
    void getMoney(int amount, int atmId);
    void addMoney(int amount, int atmId);
    void getBalance();
}
