package lesson10;

public class Mark<T extends Number> {
    private final T mark;

    public Mark(T mark) {
        this.mark = mark;
    }

    public static void main(String[] args) {
        Mark<Integer> mark = new Mark<>(1);
        System.out.println(mark.sameAny(mark));

        Mark<Integer> mark1 = new Mark<>(1);
        System.out.println(mark.sameAny(mark1));

        String number = "1";

    }

    public T getMark() {
        return mark;
    }

    public int roundMark() {
        return Math.round(mark.floatValue());
    }

    /* вместо */ // public boolean sameAny (Mark<T> ob) {
    public boolean sameAny(Mark<?> ob) {
        return roundMark() == ob.roundMark();
    }

    public boolean same(Mark<T> ob) {
        return getMark() == ob.getMark();
    }
}
