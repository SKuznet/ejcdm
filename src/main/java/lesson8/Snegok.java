package lesson8;

public class Snegok {
    private int id;
    private String name;
    private short age;

    public Snegok(int id) {
        this(id, "Barsik");
    }

    public Snegok(int id, String name) {
        this(id, name, (short) 0);
    }

    public Snegok(int id, String name, short age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
