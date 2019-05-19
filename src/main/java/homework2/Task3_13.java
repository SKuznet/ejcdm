package homework2;

import java.util.Scanner;

/**
 * 3.13. Вычислить значение логического выражения при всех возможных значениях логических величин А и В:
 * а) не (А и В);
 * б) не А или В;
 * в) А или не В.
 */

public class Task3_13 {
    private static boolean a = true;
    private static boolean b = false;
    private static boolean x;
    private static boolean y;

    public static void main(String[] args) {
        Task3_13 task = new Task3_13();

        task.getBoolean();

        task.printAnsA(task, x, y);
        task.printAnsB(task, x, y);
        task.printAnsC(task, x, y);
        System.out.println("\n");
        task.print(task);
    }

    private void getBoolean(){
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextBoolean()) {
            x = scan.nextBoolean();
        } else{
            System.out.println("You should add two boolean values");
            getBoolean();
        }
        if (scan.hasNextBoolean()) {
            y = scan.nextBoolean();
        } else{
            System.out.println("You should add two boolean values");
            getBoolean();
        }
    }

    private void print(Task3_13 task){
        task.printAnsA(task, a, a);
        task.printAnsA(task, a, b);
        task.printAnsA(task, b, a);
        task.printAnsA(task, b, b);
        System.out.println("-----------------------");

        task.printAnsB(task, a, a);
        task.printAnsB(task, a, b);
        task.printAnsB(task, b, a);
        task.printAnsB(task, b, b);
        System.out.println("-----------------------");

        task.printAnsC(task, a, a);
        task.printAnsC(task, a, b);
        task.printAnsC(task, b, a);
        task.printAnsC(task, b, b);
    }

    private void printAnsA(Task3_13 task, boolean a, boolean b){
        System.out.println("task a: " + a + " " + b + " |" + task.taskA(a, b));
    }
    private void printAnsB(Task3_13 task, boolean a, boolean b){
        System.out.println("task b: " + a + " " + b + " |" + task.taskB(a, b));
    }
    private void printAnsC(Task3_13 task, boolean a, boolean b){
        System.out.println("task c: " + a + " " + b + " |" + task.taskC(a, b));
    }

    private boolean taskA(boolean a, boolean b){
        return !(a && b);
    }

    private boolean taskB(boolean a, boolean b){
        return !(a || b);
    }

    private boolean taskC(boolean a, boolean b){
        return a || !b;
    }
}