package lesson8;

public class Cat {

    private String privateName;
    protected String protectedInfo = "I am cat";
    String defaultName = "Barsik";
    public String publicVoice = "Muaua";


    public String getName() {
        return privateName;
    }

    public void setName(String namæe) {
        this.privateName = namæe;
    }

    public static void main(String[] args) {

    }
}
