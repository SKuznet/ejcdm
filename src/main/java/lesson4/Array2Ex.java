package lesson4;

import java.util.Arrays;

/**
 * This class about arrays
 *
 * @author sergey_kuznetsov
 * @version 21
 * @since 21.10.2001@since 21.10.2001@since 21.10.2001@since 21.10.2001@since 21.10.2001@since 21.10.2001@since 21.10.2001@since 21.10.2001@since 21.10.2001@since 21.10.2001@since 21.10.2001@since 21.10.2001
 */
public class Array2Ex {
    int a;
    int b;
    int c;
    private String name;
    private String surname;

    public static void main(String[] args) {
        int[][] array = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = j;
            }
        }

        System.out.println(Arrays.deepToString(array));
        System.out.println(array[1].length);
        System.out.println(array.getClass().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    class InfoArray {

    }
}
