package task11;

class DataPeople {
    private static volatile int dataMoneyAccount = 1000;

    static synchronized void getDataMoneyAccount(int a) {
        DataPeople.dataMoneyAccount = DataPeople.dataMoneyAccount - a;
    }

    static synchronized void setDataMoneyAccount(int a) {
        DataPeople.dataMoneyAccount = DataPeople.dataMoneyAccount + a;
    }

    static synchronized int getDataMoneyAccount() {
        return dataMoneyAccount;
    }
}
