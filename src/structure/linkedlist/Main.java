package structure.linkedlist;

import structure.queue.LoopQueue;
import structure.queue.Queue;
import structure.stack.ArrayStack;
import structure.stack.Stack;

import java.util.Random;

/**
 * @Author lucasma
 * @Date 2018/4/29 下午6:35
 */
public class Main {


    private static double testStack(Stack<Integer> stack, int opCount) {

        Long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }
        Long endTime = System.nanoTime();

        return (endTime-startTime)/ 1000000000.0;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(2, 666);
        System.out.println(linkedList);

        /*
        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst(0);

        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);*/


        /*int opCount = 5000000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);
        System.out.println("ArrayQueue, time:" + time1 + "s");

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, opCount);
        System.out.println("LoopQueue, time:" + time2 + "s");*/
    }
}
