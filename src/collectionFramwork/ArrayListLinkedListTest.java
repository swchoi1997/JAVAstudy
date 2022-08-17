package collectionFramwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(10000000);
        LinkedList linkedList = new LinkedList();

        System.out.println("순차적으로 추가하기");
        System.out.println("ArrayList : " + add1(arrayList));
        System.out.println("LinkedList : " + add1(linkedList));
        System.out.println();
        System.out.println("중간에 추가하기");
        System.out.println("ArrayList : " + add2(arrayList));
        System.out.println("LinkedList : " + add2(linkedList));
        System.out.println( );
        System.out.println("중간에 삭제하기");
        System.out.println("ArrayList : " + removeal2(arrayList));
        System.out.println("LinkedList : " + removeal2(linkedList));
        System.out.println( );
        System.out.println("순차적으로 삭제하기");
        System.out.println("ArrayList : " + removeal1(arrayList));
        System.out.println("LinkedList : " + removeal1(linkedList));
        System.out.println( );

    }

    public static long add1(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long add2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(500 + "X");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeal1(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeal2(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
