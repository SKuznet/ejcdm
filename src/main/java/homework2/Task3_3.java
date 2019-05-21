package homework2;

public class Task3_3 {
    private static boolean a = true;
    private static boolean b;
    private static boolean c;

    public static void main(String[] args) {
        Task3_3 task = new Task3_3();
        System.out.println("task a: " + task.taskA(a, b));
        System.out.println("task b: " + task.taskB(a, b));
        System.out.println("task c: " + task.taskC(a, b, c));
    }

    private boolean taskA(boolean a, boolean b){
        return !a && b;
    }

    private boolean taskB(boolean a, boolean b){
        return a || !b;
    }

    private boolean taskC(boolean a, boolean b, boolean c){
        return a && b || c;
    }
}