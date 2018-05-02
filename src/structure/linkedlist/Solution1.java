package structure.linkedlist;

/**
 * @Author lucasma
 * @Date 2018/5/1 下午9:51
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
class Solution1 {

    public ListNode removeElements(ListNode head, int val) {
        // 1 head 节点本身就是 val的时候,删除head，可能删除了第一元素， 第二个还和要删除的元素一致，所以使用while 循环
        while (head != null && head.val == val) {
//            ListNode delNode = head;
//            head = head.next;
//            delNode = null;
            head=head.next;
        }
        // 2 所有的元素都是要删除的 ， 那么执行完毕上面的代码， 该链表就已经为空了
        if (head == null) {
            return null;
        }
        // 3 删除链表中间的元素 val
        ListNode prev = head;
        //还没遍历到最后一个元素，则看一下下一个元素是不是要被删除的
        while (prev.next != null) {
            if (prev.next.val == val) {
//                ListNode delNode = prev.next;
//                prev.next = delNode.next;
//                delNode.next = null;
                prev.next=prev.next.next;
            } else {
                prev=prev.next;
            }
        }

        return head;

    }
}
