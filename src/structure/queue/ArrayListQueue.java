package structure.queue;

import java.util.ArrayList;

/**
 * @author Administrator
 * @date 2018/6/7  15:27
 *
 * ArrayList 实现 queue
 */
public class ArrayListQueue<E> implements Queue<E> {

    private ArrayList arrayList;

    public ArrayListQueue(int capacity) {
        arrayList = new ArrayList(capacity);
    }

    public ArrayListQueue() {
        arrayList = new ArrayList();
    }

    @Override
    public int getSize() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        arrayList.add(arrayList.size(), e);
    }

    @Override
    public E dequeue() {
        return (E) arrayList.remove(0);
    }

    @Override
    public E getFront() {
        return (E) arrayList.get(0);
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue:");
        res.append(" front [");
        for (int i = 0; i < arrayList.size(); i++) {
            res.append(arrayList.get(i));
            if (i != arrayList.size() - 1) {
                res.append(", ");
            }
        }
        res.append("] tail");
        return res.toString();
    }
}
