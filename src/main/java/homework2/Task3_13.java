package homework2;

import jdk.internal.dynalink.linker.ConversionComparator;
import sun.plugin2.message.Conversation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3_13 {
    private static boolean a = true;
    private static boolean b;
    private static boolean valueX;
    private static boolean valueY;

    public static void main(String[] args) {
        Task3_13 task = new Task3_13();

        task.getBoolean();

        task.printAnsA(task, valueX, valueY);
        task.printAnsB(task, valueX, valueY);
        task.printAnsC(task, valueX, valueY);
        System.out.println("\n");
        task.print(task);
    }

    private void getBoolean(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            valueX = Boolean.parseBoolean(reader.readLine().trim());
            valueY = Boolean.parseBoolean(reader.readLine().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void print(Task3_13 task){
        task.printAnsA(task, a, a);
        task.printAnsA(task, a, b);
        task.printAnsA(task, b, a);
        task.printAnsA(task, b, b);
        System.out.println("-------------------------");

        task.printAnsB(task, a, a);
        task.printAnsB(task, a, b);
        task.printAnsB(task, b, a);
        task.printAnsB(task, b, b);
        System.out.println("-------------------------");

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