package lesson12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunnableEx {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        };

        Runnable runnable1 = () -> System.out.println("Hello!");

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.toString());
            }
        };

        ActionListener listener1 = e -> System.out.println(e.toString());


    }
}
