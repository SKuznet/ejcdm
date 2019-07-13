package homework11;

public class FactoryATM {
    public ATM create(String name, Bank bank){
        switch (name){
            case "Sber": return new Sber(bank);
            case "Alfa": return new Alfa(bank);
            case "Raif": return new Raif(bank);
            default: throw new IllegalArgumentException();
        }
    }
}
