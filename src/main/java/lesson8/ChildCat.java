package lesson8;

public class ChildCat extends ParentCat {
    public int age = 1;

    public static void main(String[] args) {
        System.out.println(new ChildCat().getAge());
    }

    int getAge() {
        return ((ParentOfParentCat)this).age;
    }
}
