package ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qq940 on 2018/3/11.
 */

public class HasCycle {
    /**
     * 使用双指针，一个指针每次移动一个节点，一个指针每次移动两个节点，如果存在环，那么这两个指针一定会相遇。
     * @param head
     * @return
     */
    public boolean hasCycle (ListNode head) {
        if (head == null){
            return false;
        }
        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != null && l2 != null) {
            if(l1 == l2) return true;
            l1 = l1.next;
            if(l2.next == null) break;
            l2 = l2.next.next;
        }
        return false;
    }

    public boolean hasCircle2 (ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
