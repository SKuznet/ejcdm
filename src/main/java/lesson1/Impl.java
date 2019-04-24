package lesson1;

import java.util.concurrent.locks.Lock;

public class Impl implements Interface1, Interface2 {


    public static void main(String[] args) {
        new Impl().getInfo();
    }

    @Override
    public void getInfo() {
        System.out.println("Hello from override!");
    }
}
