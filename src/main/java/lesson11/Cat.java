package lesson11;

public class Cat {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    class Barsik {
        public void getInfo() {
            System.out.println(" I am cat " + name);
        }

        public final static String MAIN_NAME = "BARSIK";

        public void setName(String catName) {
            name = catName;
        }
    }

    static class Murzik {
        static final String GET_NAME = "Murzik";
    }

    public static void main(String[] args) {
        System.out.println(Barsik.MAIN_NAME);
    }
}
