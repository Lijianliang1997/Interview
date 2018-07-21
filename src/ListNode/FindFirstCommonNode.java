package ListNode;

/**
 * @author lijianliang
 * @date 2018/7/21.
 */
public class FindFirstCommonNode {
    /**
     * 相当于将p1和p2拼接起来,因为如果有公共节点,所以末尾是一样的,
     * 公共节点在两个链表中所处的位置也是一样的
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = (p1 == null ? pHead2 : p1.next);
            p2 = (p2 == null ? pHead1 : p2.next);
        }
        return p1;
    }
}
