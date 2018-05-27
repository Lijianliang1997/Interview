package ListNode;

import java.util.Stack;

/**
 * Created by qq940 on 2018/1/3.
 */
public class ReverseList {
    public static ListNode ReverseListByStack(ListNode head) {
        if (head == null || head.next ==null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode resultList = null;
        ListNode temp = stack.pop();
        resultList = temp;
        ListNode list = temp;
        while (stack.size() > 1) {
            temp = stack.pop();
            resultList.next = temp;
            resultList = resultList.next;
        }
        temp = stack.pop();
        resultList.next = temp;
        temp.next = null;
        return list;
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
        ListNode node = ReverseListByStack(node1);
        while (node != null) {
            System.out.println("value is :" + node.val);
            node = node.next;
        }
    }
}
