package structure.stack;

import java.util.ArrayList;

/**
 * @author Administrator
 * @date 2018/6/7  14:26
 * ArrayList 实现 Stack
 */
public class ArrayListStack<E> implements Stack<E> {

    ArrayList arrayList =new ArrayList<>() ;

    @Override
    public int getSize() {
        return arrayList.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public E pop() {
        return (E) arrayList.remove(arrayList.size() - 1);
    }

    @Override
    public E peek() {
        return  (E) arrayList.get(arrayList.size() - 1);
    }

    @Override
    public void push(Object o) {
        arrayList.add(arrayList.size(), o);
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack :");
        res.append("[");
        for (int i = 0; i < arrayList.size(); i++) {
            res.append(arrayList.get(i));
            if (i != arrayList.size() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }

}