package preparation.OCA.Chapter5;

interface Aquatic {
    public default int getNumberOfGills(int input) { return 2; }
}
public class ClownFish implements Aquatic {
    public String getNumberOfGills() { return "4"; }
    //public String getNumberOfGills(int input) { return "6"; }
    public static void main(String[] args) {
        System.out.println(new ClownFish().getNumberOfGills(-1));
    }
}
