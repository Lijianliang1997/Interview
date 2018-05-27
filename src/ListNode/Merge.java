package ListNode;

/**
 * Created by qq940 on 2018/1/7.
 */
public class Merge {
    public static ListNode Merge(ListNode list1,ListNode list2) {
        ListNode tempList = new ListNode(0);
        ListNode resultList = tempList;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tempList.next = list1;
                list1 = list1.next;
            } else {
                tempList.next = list2;
                list2 = list2.next;
            }
            tempList = tempList.next;
        }
        while (list1 != null) {
            tempList.next = list1;
            list1 = list1.next;
            tempList = tempList.next;
        }
        while (list2 != null) {
            tempList.next = list2;
            list2 = list2.next;
            tempList = tempList.next;
        }
        return resultList.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(4);
        ListNode node = null;
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        Merge(node1, node);
    }
}
