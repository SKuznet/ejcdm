package lesson11;

public class Runner2 {
    public static void main(String[] args) {
        System.out.println(((CatInterface) () -> "barsik").catToString());

        System.out.println(new AbstractCat() {
            @Override
            String getName() {
                return "murzik";
            }
        });
    }
}
