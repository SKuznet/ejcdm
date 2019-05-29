package lesson11;

import lesson2.Snegok;

public class Main {
    public static void main(String[] args) {
        MathOperate mathOperate = (s, v) -> s + v;

        MathOperate mathOperate1 = new MathOperate() {
            @Override
            public int getResult(int val1, int val2) {
                return val1 + val2;
            }
        };

        System.out.println(mathOperate.getResult(1, 2));

        System.out.println(Cats.Barsik.equals(Cats.Murzik));

        Cats catsEnum = Cats.Barsik;

        catsEnum = Cats.valueOf("Murzik");

        System.out.println(catsEnum);
    }
}
