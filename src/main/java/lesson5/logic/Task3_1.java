package lesson5.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Вычислить значение логического выражения при следующих значениях логи-
 * ческих величин А, В и С: А = Истина, В = Ложь, С = Ложь:
 */
public class Task3_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a: f - false, t - true");
        String aString = reader.readLine();

        System.out.println("Please enter b: f - false, t - true");
        String bString = reader.readLine();

        System.out.println("Please enter c: f - false, t - true");
        String cString = reader.readLine();

        boolean a = parseStringToBoolean(aString);
        boolean b = parseStringToBoolean(bString);
        boolean c = parseStringToBoolean(cString);

        Task3_1 task = new Task3_1();
        System.out.println("task a: " + task.taskA(a, b));
        System.out.println("task b: " + task.taskB(a, b));
        System.out.println("task c: " + task.taskB(b, c));
    }

    private static boolean parseStringToBoolean(String value) {
        if (value.equalsIgnoreCase("f")) {
            return false;
        } else if (value.equalsIgnoreCase("t")) {
            return true;
        } else {
            throw new IllegalArgumentException("Wrong type of value");
        }
    }

    private boolean taskA(boolean a, boolean b) {
        return a || b;
    }

    private boolean taskB(boolean a, boolean b) {
        return a && b;
    }

    private boolean taskC(boolean b, boolean c) {
        return b || c;
    }

}
