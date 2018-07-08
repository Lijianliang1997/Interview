package ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by qq940 on 2018/1/1.
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if (listNode == null) {
            return resultList;
        }
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            resultList.add(stack.pop());
        }
        return resultList;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if (listNode == null) {
            return resultList;
        }
        if (listNode.next == null) {
            resultList.add(listNode.val);
            return resultList;
        }
        ListNode prev = listNode;
        ListNode now = listNode.next;
        listNode.next = null;
        ListNode next;
        while (now != null) {
            next = now.next;
            now.next = prev;
            prev = now;
            now = next;
        }
        while (prev != null) {
            resultList.add(prev.val);
            prev = prev.next;
        }
        return resultList;
    }
}
