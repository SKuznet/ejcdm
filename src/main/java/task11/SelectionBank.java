package task11;

interface Action {
    void putMoney(int b);

    void getMoney(int b);

    void checkBalance();
}

interface CreateBank {
    Action createBank();
}

class SelectionBank {
    static CreateBank getCreateBankByName(String bank1) {
        if (bank1.equals("1")) {
            return new SberAtm();
        } else if (bank1.equals("2")) {
            return new SpbAtm();
        } else {
            throw new RuntimeException("We don't have this bankAtm");
        }
    }
}
