package task02;

public class Logic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println("no A and B= " + DoСW1.doСW1(a, b));
        System.out.println("A or no B= " + DoСW2.doСW2(a, b));
        System.out.println("A and B or C= " + DoСW3.doСW3(a, b, c));

        System.out.println("no (А and B)= " + DoСW4.doСW4(a, b));
        System.out.println("A or no B= " + DoCW5.doСW5(a, b));
        System.out.println("A and B or C= " + DoCW6.doСW6(a, b));

        boolean x = true;
        boolean y = true;
        boolean z = false;
        System.out.println("No (Y or no X and Z) or Z= " + DoCW7.doСW7(x, y, z));
        System.out.println("X or no (no y or z) or Y= " + DoCW8.doСW8(x, y, z));
        System.out.println("no(x or y and z) or no x= " + DoCW9.doСW9(x, y, z));
    }
}


