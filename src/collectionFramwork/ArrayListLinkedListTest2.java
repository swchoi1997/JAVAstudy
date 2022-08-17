package collectionFramwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(10000000);
        LinkedList linkedList = new LinkedList();
        add(arrayList);
        add(linkedList);

        System.out.println("접근 시간 테스트");
        System.out.println("ArrayList : " + access(arrayList));
        System.out.println("LinkedList : " + access(linkedList));

        /*
        배열은 각 요소들이 연속적으로 메모리 상에 존재하기 때문에 간단한 계산만으로 원하는 요소의 주소를 얻어서 자장된 데이터를 곧바로 읽어올 수 있지만
        링크드 리스트트 불연속적으로 위치한 각 요소들이 서로 연결된 것이러 처음부터 n 번쨰 데이터까지 차례대로 따라가야만 원하는 값을 얻을 수 있음
         */
    }

    public static void add(List list) {
        for (int i = 0; i < 100000; i++) list.add(i + "");
    }

    public static long access(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) list.get(i);
        long end = System.currentTimeMillis();

        return end - start;
    }
}
