package task11;

public class CreateSpb implements Action {

    @Override
    public void putMoney(int b) {
        DataPeople.setDataMoneyAccount(b);
    }

    @Override
    public void getMoney(int b) {
        DataPeople.getDataMoneyAccount(b);
    }

    @Override
    public void checkBalance() {
        System.out.println("Yor money "+DataPeople.getDataMoneyAccount());
    }
}
