package structure.BST;

/**
 * @Author lucasma
 * @Date 2018/5/10 下午9:40
 * <p>
 * 二分搜索树,需要继承 Comparable 这个接口。
 * 二分搜索树的类型需要有可比性
 */
public class BST<E extends Comparable<E>> {
    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    /**
     * 二分搜索树存储的元素
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * 向二分搜索树中添加元素 e
     *
     * @param e
     */
    public void add(E e) {
        root = add(root, e);
    }

    /**
     * 向以node 为根的二分搜索树添加元素 e 递归算法
     * 返回新插入元素后二分搜索树的根
     *
     * @param node
     * @param e
     */
    private Node add(Node node, E e) {
        // 先处递归算法的终止条件
        if (node == null) {
            size++;
            return new Node(e);
        }
        // 递归处理
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }

        return node;
    }


    /**
     * 查询二分搜索树中是否包含元素 e
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        if (root == null) {
            // root 为空，明显是没有元素的
            return false;
        } else if (e.compareTo(node.e) < 0) {
            // 如果在左子树中，递归一次
            return contains(node.left, e);
        } else {
            // 如果在右子树中，递归一次
            return contains(node.right, e);
        }
    }

    /**
     * 二分搜索树的前序遍历
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    /**
     * 生成以 node 为根节点， 深度为 depth 的描述二叉树的字符串
     *
     * @param node
     * @param depth
     * @param res
     */
    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth) + "null\n");
            return;
        }

        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left,depth+1,res);
        generateBSTString(node.right,depth+1,res);
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

}
