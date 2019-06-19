package lesson18;

import java.io.IOException;

public class VolatileEx {
    private static volatile boolean flag = true;

    public static void main(String[] args) {

        // общая кастрюля
        new ThreadFlagSetter().start(); // egg
        new ThreadFlagReader().start(); // hen
    }

    public static class ThreadFlagReader extends Thread {
        @Override
        public void run() {

            // своя кастрюля
            System.err.println("waiting...");
            while (flag) {

            }

            System.err.println("Go go go");
        }
    }

    public static class ThreadFlagSetter extends Thread {
        @Override
        public void run() {

            // своя кастрюля
            try {
                int k = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            flag = false;

            System.err.println("Flag now is down");
        }
    }
}
