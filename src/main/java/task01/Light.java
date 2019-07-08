package task01;

import java.util.Scanner;

public class Light {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        if (num1 >= 1) {
            int num;
            Math.floor(num1);
            num = (int) num1;
            switch (num % 6) {
                case 0:
                case 5:
                case 4: {
                    System.out.println("GREEN");
                }
                break;
                case 3: {
                    System.out.println("Yellow");
                }
                break;
                case 2:
                case 1: {
                    System.out.println("RED");
                }
                break;
            }
        } else {
            System.out.println("Don't work in this range");
        }
    }
}


