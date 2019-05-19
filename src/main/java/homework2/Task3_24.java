package homework2;

import java.util.Scanner;

/**
 * Вычислить значение логического выражения при всех возможных значениях логических величин X, Y и Z:
 * а) не (Y или не X и Z) или Z;
 * б) X и не (не Y или Z) или Y;
 * в) не (X или Y и Z) или не X.
 */

public class Task3_24 {
    private static boolean a = true;
    private static boolean b = false;

    private static boolean x;
    private static boolean y;
    private static boolean z;

    public static void main(String[] args) {
        Task3_24 task = new Task3_24();

        task.getBoolean();

        task.printAnsA(task, x, y, z);
        task.printAnsB(task, x, y, z);
        task.printAnsC(task, x, y, z);
        System.out.println("\n");

        task.print(task);
}

    private void getBoolean(){
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextBoolean()) {
            x = scan.nextBoolean();
        } else{
            System.out.println("You should add three boolean values");
            getBoolean();
        }
        if (scan.hasNextBoolean()) {
            y = scan.nextBoolean();
        } else{
            System.out.println("You should add three boolean values");
            getBoolean();
        }
        if (scan.hasNextBoolean()) {
            z = scan.nextBoolean();
        } else{
            System.out.println("You should add three boolean values");
            getBoolean();
        }
    }

    private void print(Task3_24 task){
        task.printAnsA(task, a, a, a);
        task.printAnsA(task, a, a, b);
        task.printAnsA(task, a, b, a);
        task.printAnsA(task, a, b, b);
        task.printAnsA(task, b, a, a);
        task.printAnsA(task, b, a, b);
        task.printAnsA(task, b, b, a);
        task.printAnsA(task, b, b, b);
        System.out.println("----------------------------------------------");

        task.printAnsB(task, a, a, a);
        task.printAnsB(task, a, a, b);
        task.printAnsB(task, a, b, a);
        task.printAnsB(task, a, b, b);
        task.printAnsB(task, b, a, a);
        task.printAnsB(task, b, a, b);
        task.printAnsB(task, b, b, a);
        task.printAnsB(task, b, b, b);
        System.out.println("----------------------------------------------");

        task.printAnsC(task, a, a, a);
        task.printAnsC(task, a, a, b);
        task.printAnsC(task, a, b, a);
        task.printAnsC(task, a, b, b);
        task.printAnsC(task, b, a, a);
        task.printAnsC(task, b, a, b);
        task.printAnsC(task, b, b, a);
        task.printAnsC(task, b, b, b);
    }

    private void printAnsA(Task3_24 task, boolean x, boolean y, boolean z){
        System.out.println("task a: " + x + " " + y + " " + z + " | " + task.taskA(x, y, z));
    }
    private void printAnsB(Task3_24 task, boolean x, boolean y, boolean z){
        System.out.println("task b: " + x + " " + y + " " + z + " | " + task.taskB(x, y, z));
    }
    private void printAnsC(Task3_24 task, boolean x, boolean y, boolean z){
        System.out.println("task c: " + x + " " + y + " " + z + " | " + task.taskC(x, y, z));
    }

    private boolean taskA(boolean x, boolean y, boolean z){
        return !(y || !x && z) || z;
    }

    private boolean taskB(boolean x, boolean y, boolean z){
        return x && !(!y || z) || y;
    }

    private boolean taskC(boolean x, boolean y, boolean z){
        return !(x || y && z) || !x;
    }
}