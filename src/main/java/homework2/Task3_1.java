package homework2;

public class Task3_1 {
    private static boolean a = true;
    private static boolean b;
    private static boolean c;

    public static void main(String[] args) {
        Task3_1 task = new Task3_1();
        System.out.println("task a: " + task.taskA(a, b));
        System.out.println("task b: " + task.taskB(a, b));
        System.out.println("task c: " + task.taskC(b, c));
    }

    private boolean taskA(boolean a, boolean b){
        return a || b;
    }

    private boolean taskB(boolean a, boolean b){
        return a && b;
    }

    private boolean taskC(boolean b, boolean c){
        return b || c;
    }
}
