package ListNode;

import java.util.Stack;

/**
 * Created by qq940 on 2018/1/3.
 */
public class FindKthToTail {
    /**
     * 使用栈
     * @param head
     * @param k
     * @return
     */
    public static ListNode findKthToTail(ListNode head, int k) {
        /**
         * 边界考虑
         */
        if (head == null || k ==0) {
            return null;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        if (k > stack.size()) { // 考虑k大于链表长度的情况
            return null;
        }
        while(k > 1) {
            stack.pop();
            k --;
        }
        return stack.pop();
    }

    /**
     * 使用两条相同的链表head,node，head先跑k次，然后在一起跑到head底部，此时node就为倒数第k个
     * @param head
     * @param k
     * @return
     */
    public static ListNode findKthToTail2(ListNode head, int k) {
        if (head == null || k ==0) {
            return null;
        }
        ListNode listNode = head;
        while (k > 0) {
            if (head == null) {
                break;
            }
            head = head.next;
            k --;
        }
        if (k > 0) {
            return null;
        }
        while (head != null) {
            head = head.next;
            listNode = listNode.next;
        }
        return listNode;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(findKthToTail2(node1,5).val);
    }
}
