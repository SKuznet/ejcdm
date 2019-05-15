package lesson4;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }

        System.out.println(Arrays.toString(array));

        int[] array2 = new int[]{4, 7, 9};
        System.out.println(Arrays.toString(array2));

        System.out.println(array2.length);
        System.out.println(array2[2]);

        System.out.println(Runtime.getRuntime().maxMemory());

        int[] array3 = new int[3];
        array3[1] = 2;

        System.out.println(Arrays.toString(array3));

        Integer[] array4 = new Integer[3];
        array4[1] = 2;

        System.out.println(Arrays.toString(array4));
    }
}
