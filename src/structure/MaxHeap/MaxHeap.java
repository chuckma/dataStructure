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
     * 将任意数组 组合成堆的形状。原理是将数组视为完全二叉树，
     * 从最后一个非叶子节点开始，从后向前，倒着对每个元素进行 "下沉" 操作
     * @param arr
     */
    public MaxHeap(E[] arr) {
        data = new Array<>(arr);
        for (int i = parent(arr.length - 1); i >= 0; i--) {
            siftDown(i);
        }
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
     *
     * @param index
     * @return
     */
    private int rightChild(int index) {
        return index * 2 + 2;
    }


    /**
     * 向堆中添加元素
     *
     * @param e
     */
    public void add(E e) {
        data.addLast(e);
        // 上浮元素的索引，是新加入的元素的索引，也是数组最后的元素的索引
        siftUp(data.getSize() - 1);
    }

    private void siftUp(int k) {
        // 如果自己父节点值比自己还小， 则需要将自己进行上浮，就是位置的交换
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            data.swap(k, parent(k));
            k = parent(k);
        }
    }


    /**
     * 找出最大的元素
     *
     * @return
     */
    public E findMax() {
        if (data.getSize() == 0) {
            throw new IllegalArgumentException("Cannot findMax when heap is empty!");
        } else {
            return data.get(0);
        }
    }

    /**
     * 取出最大的元素
     *
     * @return
     */
    public E extractMax() {

        E ret = findMax();
        // 位置交换
        data.swap(0, data.getSize() - 1);
        data.removeLast();
        // 元素下沉操作
        siftDown(0);
        return ret;
    }

    private void siftDown(int k) {
        // k 节点一个子节点都没有
        while (leftChild(k) < data.getSize()) {
            int j = leftChild(k);
            if (j + 1 < data.getSize() && data.get(j + 1).compareTo(data.get(j)) > 0) {
                j = rightChild(k);
                // 此时 data[j] 是leftChild 和 rightChild中最大的值
            }
            if (data.get(k).compareTo(data.get(j)) >= 0) {
                // 如果已经比左右子节点都大了，就不需要下沉了。
                break;
            } else {
                data.swap(k, j);
                k = j;
            }
        }
    }

    /**
     * 取出堆中最大的元素，并且替换成元素 e
     *
     * @param e
     * @return
     */
    public E replace(E e) {
        E ret = findMax();
        data.set(0, e);
        siftDown(0);
        return ret;
    }


}
