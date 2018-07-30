package structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/6/1  9:32
 */
public class Main {

    private static double test(List list, Integer[] arr) {
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        Long endTime = System.currentTimeMillis();

        return (endTime-startTime);//%1000;

    }
    public static void main(String[] args) {
        int N = 1000000;

        // 测试1 一般性测试
        System.out.println("Test for random array, size = " + N + " , random range [0, " + N + "]");
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
//        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
//        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr4 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr5 = Arrays.copyOf(arr1, arr1.length);
//        Integer[] arr6 = Arrays.copyOf(arr1, arr1.length);
//        Integer[] arr7 = Arrays.copyOf(arr1, arr1.length);

        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> linkedList1 = new LinkedList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        double t1 = test(linkedList, arr1);
        System.out.println("linkedList===="+t1);
        double t2 = test(arrayList, arr1);
        System.out.println("arrayList===="+t2);
        int[] arr = {1, 2, 3,4, 5, 6, 7, 8, 9};


    }
}
