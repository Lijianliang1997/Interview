package ListNode;

import java.util.ArrayList;
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
}
