package homework2;

/**
 * 3.3. Вычислить значение логического выражения при следующих значениях логи- ческих величин А, В и С:
 * А = Истина, В = Ложь, С = Ложь:
 * а) не А и В;
 * б) А или не В;
 * в) А и В или С.
 */
public class Task3_3 {
    private static boolean a = true;
    private static boolean b = false;
    private static boolean c = false;

    public static void main(String[] args) {
        Task3_3 task = new Task3_3();
        System.out.println("task a:" + task.taskA(a, b));
        System.out.println("task b:" + task.taskB(a, b));
        System.out.println("task c:" + task.taskC(a, b, c));
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