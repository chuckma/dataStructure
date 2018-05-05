package structure.linkedlist;

/**
 * @Author lucasma
 * @Date 2018/5/5 上午8:01
 * 理解研究 LinkedList 编码实现
 */
public class LinkedListExample<E> {

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


    private Node dummyHead;
    private int size;

    public LinkedListExample() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    /**
     * 获取链表中元素的个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 链表是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表 index 的位置添加元素，仅作为练习，实际中不使用这种方式
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed ,index is illegal");
        }
        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        /*Node node = new Node(e);
        node.next=prev.next;
        prev.next=node;*/
        prev.next = new Node(e, prev.next);
        size++;
    }

    /**
     * 链表头添加元素
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }


    /**
     * 链表尾部添加元素
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 删除元素和插入元素一样，必须先找到要删除元素的前一个元素，前一个元素的 next
     * 就是要删除的，prev.next
     * 删除 index 位置的元素
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Remove failed ,index is illegal");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            // 先循环找到 待删除节点的前一个节点
            prev = prev.next;
        }
        // 要删除的节点
        Node retNode = prev.next;
        // 让前一个节点指向 待删除节点 retNode 的下一个节点，这就直接越过了删除的节点
        prev.next = retNode.next;
        // 再让retNode 指向 null
        retNode.next = null;
        // size --
        size--;
        return retNode.e;
    }

    /**
     * 删除第一个元素
     *
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 删除末尾元素
     *
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 修改 index 位置的元素 为 e
     *
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Set failed , index is illegal");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    /**
     * 获取位置为 index 的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Get failed , index is illegal");
        }
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获取 链表第一个元素
     *
     * @return
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获取 链表末尾元素
     *
     * @return
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 查询是否含有 元素 e
     * @param e
     * @return
     */
    public boolean contains(E e) {
        Node cur = dummyHead.next;
        while (cur.next != null) {
            if (cur.e.equals(e)) {
                return true;
            }else {
                cur = cur.next;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}

