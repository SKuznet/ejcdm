package lesson16;

import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Murzik");
        list.add("Murzik");
        list.add("Murzik");
        list.add("Murzik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Barsik");
        list.add("Riska");

        for (String name : list) {
            if (name.equals("Riska")) {
                list.remove("Riska");
            }
        }

        System.out.println(list.size());
//        System.out.println(list.get(8));

        list.removeAll(Collections.singleton(null));

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(list.indexOf("Barsik"));
        System.out.println(list.lastIndexOf("Barsik"));

        List<String> newList = list.subList(2, 5);
        ListIterator listIterator = newList.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println(newList.size());

        System.out.println(list);
        System.out.println(list.size());


//
//        Iterator iterator1 = newList.iterator();
//        while (iterator1.hasNext()) {
//            System.out.println(iterator1.next());
//        }
    }

    public boolean removeAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        Iterator<?> it = iterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }
}
