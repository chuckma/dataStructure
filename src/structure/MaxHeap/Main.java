package structure.MaxHeap;

import java.util.Random;

/**
 * @Author lucasma
 * @Date 2018/5/20 上午10:03
 *
 *
 */
public class Main {

    private static double testHeap(Integer[] testData,boolean isHeapify) {

        long startTime = System.nanoTime();

        MaxHeap<Integer> maxHeap;
        if (isHeapify) {
            maxHeap = new MaxHeap<>(testData);
        } else {
            maxHeap = new MaxHeap<>();
            for (int num : testData) {
                maxHeap.add(num);
            }
        }
        int[] arr = new int[testData.length];
        for (int i = 0; i < testData.length; i++) {
            arr[i] = maxHeap.extractMax();
        }

        for (int i = 1; i < testData.length; i++) {
            if (arr[i - 1] < arr[i]) {
                throw new IllegalArgumentException("Error");
            }
        }

        System.out.println("Test MaxHeap completed!");

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;

    }


    public static void main(String[] args) {
        int n = 100000;
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        Random random = new Random();
        /*for (int i = 0; i < n; i++) {
            maxHeap.add(random.nextInt(Integer.MAX_VALUE));
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = maxHeap.extractMax();
        }

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                throw new IllegalArgumentException("Error");
            }
        }*/

        Integer[] testData = new Integer[n];
        for (int i = 0; i < n; i++) {
            testData[i] = random.nextInt(Integer.MAX_VALUE);
        }

        /*
           同测试我们发现，使用heapify 效率是单纯向堆总添加元素操作的 的两倍
         */
        double t1 = testHeap(testData, false);
        System.out.println("without heapify use: "+ t1+"s");
        double t2 = testHeap(testData, true);
        System.out.println("with heapify use: "+ t2+"s");


        //System.out.println("Test MaxHeap completed!");
    }
}
