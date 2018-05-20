package structure.MaxHeap;

/**
 * @Author Lucas Ma
 * @Date 2018/5/20 上午10:04
 * <p>
 * 最大堆 规定了每一个节点的值 >= 其子节点的值
 */
public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;

    public MaxHeap(int capaticy) {
        data = new Array<>(capaticy);
    }

    public MaxHeap() {
        data = new Array<>();
    }

    /**
     * 返回堆中的元素个数
     *
     * @return
     */
    public int size() {
        return data.getSize();
    }

    /**
     * 堆是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }


    /**
     * 完全二叉树的数组表示中，一个索引所表示的元素的父亲节点的索引
     *
     * @param index
     * @return
     */
    private int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index 0 doesn't have parent.");
        } else {
            return (index - 1) / 2;
        }
    }


    /**
     * 完全二叉树的数组表示中，一个索引所表示的元素的左孩子节点的索引
     *
     * @param index
     * @return
     */
    private int leftChild(int index) {
        return index * 2 + 1;
    }


    /**
     * 完全二叉树的数组表示中，一个索引所表示的元素的右孩子节点的索引
     * @param index
     * @return
     */
    private int rightChild(int index) {
        return index * 2 + 2;
    }
}
