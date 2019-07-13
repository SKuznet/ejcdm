package task11;

import java.util.Scanner;

class MainActions {
    private static void operations() {
        Scanner in = new Scanner(System.in);
        System.out.println("We have Spb and Sber atm, write number atm for work 1-Spb, 2-Sber");
        String choice = in.next();
        CreateBank bank = SelectionBank.getCreateBankByName(choice);
        System.out.println("What kind of surgery do you want to perform");
        System.out.println("1 - Put money");
        System.out.println("2-  Get money");
        System.out.println("3-  look money");
        String selection = in.next();
        switch (selection) {
            case ("1"):
                System.out.println("Write the amount you want to put");
                int moneyPut = in.nextInt();
                bank.createBank().putMoney(moneyPut);
                break;
            case ("2"):
                System.out.println("Write the amount you want to get");
                int moneyGet = in.nextInt();
                bank.createBank().getMoney(moneyGet);
                break;
            case ("3"):
                bank.createBank().checkBalance();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selection);
        }
        System.out.println(DataPeople.getDataMoneyAccount());
    }

    public static void main(String[] args) {
        operations();
    }
}
