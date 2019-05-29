package lesson11;

public class Runner {
    public static void main(String[] args) {
        Cat.Barsik barsik = new Cat().new Barsik();
        barsik.setName("Barsik");
        barsik.getInfo();

        System.out.println(Cat.Barsik.MAIN_NAME);
        System.out.println(Cat.Murzik.GET_NAME);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from another thread");
            }
        });
        thread.start();
    }
}
