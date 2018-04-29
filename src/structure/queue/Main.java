package structure.queue;

import java.util.Random;

/**
 * Created by Lucas Ma Date:2018/4/27
 * 测试循环队列和数组队列性能
 */
public class Main {

    private static double testQueue(Queue<Integer> q, int opCount) {

        Long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < opCount; i++) {
            q.dequeue();
        }
        Long endTime = System.nanoTime();

        return (endTime-startTime)/ 1000000000.0;
    }

    public static void main(String[] args) {
        int opCount = 50000;

//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//        double time1 = testQueue(arrayQueue, opCount);
//        System.out.println("ArrayQueue, time:" + time1 + "s");

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, opCount);
        System.out.println("LoopQueue, time:" + time2 + "s");
    }
}
