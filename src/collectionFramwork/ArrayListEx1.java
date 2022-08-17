package collectionFramwork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(1);
        list1.add(0);
        list1.add(15);
        list1.add(25);
        list1.add(35);

        ArrayList list2 = new ArrayList(list1.subList(1, 5));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        list1.add("b");
        list2.add("c");
        list2.add(3, "h");
        print(list1, list2);
        list2.set(3, "GGGGG");
        print(list1, list2);

        // 리스트 1과 2에서 겹치는 부분만 남기고 나머지는 삭제함
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}
