package structure.linkedlist;

/**
 * @Author lucasma
 * @Date 2018/5/1 下午9:51
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
class Solution3 {

    public ListNode removeElements(ListNode head, int val) {

        // 递归算法， 1 解决对于问题最小的情况, 2 解决缩小的问题
        if (head == null) {
            return null;
        } else {
            /*ListNode resNode = removeElements(head.next, val);
            if (head.val == val) {
                return resNode;
            } else {// 如果head 不是要删除的值，则将head接在 处理之后的链表 resNode前面，然后返回
                head.next=resNode;
                return head;
            }*/
            // 优化上面的代码
            head.next = removeElements(head.next, val);
            return head.val==val?head.next:head;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);
        ListNode resNode = (new Solution3()).removeElements(head, 6);
        System.out.println(resNode);
    }
}
