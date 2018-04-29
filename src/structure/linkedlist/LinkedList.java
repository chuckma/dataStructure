package structure.linkedlist;

/**
 * Created by Lucas Ma Date:2018/4/28
 */
public class LinkedList<E> {
    /**
     *  内部类
     */
    private class Node {
        public E e;
            public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }
        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * 获取链表中的元素个数
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 链表是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表头部添加元素
     * @param e
     */
    public void addFirst(E e) {
//        Node node = new Node(e);
//        node.next = head;
//        head = node;
        head = new Node(e, head);
        size++;
    }

    /**
     * 在链表的 index 位置添加元素
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed , index is illegal");
        }
        if (index == 0) {
            addFirst(e);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }

//            Node node = new Node(e);
//            node.next = prev.next;
//            prev.next = node;
            prev.next = new Node(e,prev.next);

            size ++;
        }
    }

    /**
     * 链表的末尾添加元素
     * @param e
     */
    public void addLast(E e) {
        add(size ,e);
    }
}
