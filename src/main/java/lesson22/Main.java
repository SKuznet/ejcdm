package lesson22;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(10);
        out.write(11);
        byte[] bytes = out.toByteArray();

        System.out.println(Arrays.toString(bytes));
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
