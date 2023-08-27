package arrays;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(741);
        list.add(94);
        list.add(17);

        list.set(1, 97);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains(94));
        System.out.println(list.get(0));
    }
}
