package task03;

public class Strings01 {
    public static void main(String[] args) {
        String s;
        s = "asfa[ofsa[ofba[ofbasfab[f";
        s = s.replace("[", "");
        System.out.println(s);
        // revers from 3 to 10
        int a = 3;
        int b = 10;
        int b1 = b - 1;
        char k;
        char[] str = s.toCharArray();
        if ((a > 0) && (b <= s.length())) {
            for (int i = a - 1; i < b - 1; i++) {
                if (i < b1) {
                    k = str[i];
                    str[i] = str[b1];
                    str[b1] = k;
                    b1--;
                } else {
                    break;
                }
            }
            System.out.println(str);
        } else {
            System.out.println("Wrong input");
        }
    }
}
