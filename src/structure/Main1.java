package structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author Administrator
 * @date 2018/6/1  10:10
 */
public class Main1 {
    static final int N = 500000;

    static long timeList(List list) {
        long start = System.currentTimeMillis();
        Object o = new Object();
        for (int i = 0; i < N; i++) {
            list.add(0, o);
        }
        return System.currentTimeMillis() - start;
    }

    static long readList(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0, j = list.size(); i < j; i++) {

        }
        return System.currentTimeMillis() - start;
    }

    static List addList(List list) {
        Object o = new Object();
        for (int i = 0; i < N; i++) {
            list.add(0, o);
        }
        return list;
    }

    private static void teste() {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        List<Integer> arrayList = new ArrayList<>();
        List<Integer>  linkedList = new LinkedList<>();

    }
    public static void main(String[] args) {
//        System.out.println("ArrayList添加" + N + "条耗时：" + timeList(new ArrayList()));
//        System.out.println("LinkedList添加" + N + "条耗时：" + timeList(new LinkedList()));
//
//        List list1 = addList(new ArrayList<>());
//        List list2 = addList(new LinkedList<>());
//        System.out.println("ArrayList查找" + N + "条耗时：" + readList(list1));
//        System.out.println("LinkedList查找" + N + "条耗时：" + timeList(list2));
        List<Integer> arrayList = new ArrayList<>();
        List<Integer>  linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
            linkedList.add(i*i);
        }
        arrayList = arrayList.subList(0, 4);
        arrayList.add(1);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
