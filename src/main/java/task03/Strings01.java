package task03;

public class Strings01 {
    public static void main(String[] args) {
        String s;
        s = "012[3456[789";
        System.out.println(s);
        s = s.replace("[", "");
        System.out.println(s);
        // revers from 3 to 10
        int firstElementRevers = 3;
        int lastElementRevers = 10;
        // b1 Last element for revers decreases with each iteration
        int b1 = lastElementRevers - 1;
        char reverse;
        char[] str = s.toCharArray();
        if ((firstElementRevers > 0) && (lastElementRevers <= s.length())) {
            //swap the first and the last element
            for (int i = firstElementRevers - 1; i < lastElementRevers - 1 && (i < b1); i++) {
                reverse = str[i];
                str[i] = str[b1];
                str[b1] = reverse;
                b1--;
            }
            System.out.println(str);
        } else {
            System.out.println("Wrong input");
        }
    }
}
