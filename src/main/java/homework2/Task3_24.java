package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3_24 {
    private static boolean a = true;
    private static boolean b;

    private static boolean valueX;
    private static boolean valueY;
    private static boolean valueZ;

    public static void main(String[] args) {
        Task3_24 task = new Task3_24();

        task.getBoolean();

        task.printAnsA(task, valueX, valueY, valueZ);
        task.printAnsB(task, valueX, valueY, valueZ);
        task.printAnsC(task, valueX, valueY, valueZ);
        System.out.println("\n");

        task.print(task);
}

    private void getBoolean(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            valueX = Boolean.parseBoolean(reader.readLine().trim());
            valueY = Boolean.parseBoolean(reader.readLine().trim());
            valueZ = Boolean.parseBoolean(reader.readLine().trim());
        } catch (IOException e) {
            e.printStackTrace();
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
        System.out.println("-------------------------------------");

        task.printAnsB(task, a, a, a);
        task.printAnsB(task, a, a, b);
        task.printAnsB(task, a, b, a);
        task.printAnsB(task, a, b, b);
        task.printAnsB(task, b, a, a);
        task.printAnsB(task, b, a, b);
        task.printAnsB(task, b, b, a);
        task.printAnsB(task, b, b, b);
        System.out.println("-------------------------------------");

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