package lesson8;

public class OverloadEx {
    public static void main(String[] args) {
        System.out.println(new OverloadEx().getValue((short) 2 + (short) 3));
    }

    public short getValue(int count) {
        return (short) count;
    }

    public short getValue(short count) {
        return count;
    }
}
