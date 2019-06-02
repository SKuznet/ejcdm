package lesson10.impl;

import lesson10.IntC;
import lesson10.IntD;

import java.util.Objects;

public class IntImpl implements IntC, IntD {
    public boolean equals(IntImpl o) {
        return id == o.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private int id;

    public void getInfo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        IntImpl a = new IntImpl();
        a.id = 101;
        IntImpl b = new IntImpl();
        b.id = 101;

        if(a.equals(b)) {
            System.out.println("T");
        } else {
            System.out.println("F");
        }
    }
}
