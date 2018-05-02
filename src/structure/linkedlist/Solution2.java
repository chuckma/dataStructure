package structure.linkedlist;

/**
 * @Author lucasma
 * @Date 2018/5/1 下午9:51
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
class Solution2 {

    public ListNode removeElements(ListNode head, int val) {
        // 1 head 节点本身就是 val的时候,删除head，可能删除了第一元素， 第二个还和要删除的元素一致，所以使用while 循环
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next=head;


        // 2 删除链表中间的元素 val
        ListNode prev = dummyHead;
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

        return dummyHead.next;

    }
}
