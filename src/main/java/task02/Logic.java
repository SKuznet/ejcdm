package task02;

public class Logic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println("no A and B= " + doСW1(a, b));
        System.out.println("A or no B= " + doСW2(a, b));
        System.out.println("A and B or C= " + doСW3(a, b, c));

        System.out.println("no (А and B)= " + doСW4(a, b));
        System.out.println("A or no B= " + doСW5(a, b));
        System.out.println("A and B or C= " + doСW6(a, b));

        boolean x = true;
        boolean y = true;
        boolean z = false;
        System.out.println("No (Y or no X and Z) or Z= " + doСW7(x, y, z));
        System.out.println("X or no (no y or z) or Y= " + doСW8(x, y, z));
        System.out.println("no(x or y and z) or no x= " + doСW9(x, y, z));
    }

    static boolean doСW1(boolean a, boolean b) {
        return (!a && b);
    }

    static boolean doСW2(boolean a, boolean b) {
        return (a || !b);
    }

    static boolean doСW3(boolean a, boolean b, boolean c) {
        return (a && b || c);
    }

    static boolean doСW4(boolean a, boolean b) {
        return (!(a && b));
    }

    static boolean doСW5(boolean a, boolean b) {
        return (!a || b);
    }

    static boolean doСW6(boolean a, boolean b) {
        return (a || !b);
    }

    static boolean doСW7(boolean x, boolean y, boolean z) {
        return (!(y || !x && z) || z);
    }

    static boolean doСW8(boolean x, boolean y, boolean z) {
        return (x && !(!y || z) || y);
    }

    static boolean doСW9(boolean x, boolean y, boolean z) {
        return (!(x || y && z) || !x);
    }
}


