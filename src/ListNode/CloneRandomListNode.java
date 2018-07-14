package ListNode;

/**
 * @author lijianliang
 * @date 2018/7/14.
 */
public class CloneRandomListNode {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode pCur = pHead;
        // 复制next 如原来是 A->B->C  变成A->A'->B->B'->C->C'
        while (pCur != null) {
            RandomListNode node = new RandomListNode(pCur.label);
            node.next = pCur.next;
            pCur.next = node;
            pCur = node.next;
        }
        pCur = pHead;
        // 复制random pCur是原来链表的结点, pCur.next是复制pCur的结点
        while (pCur != null) {
            if (pCur.random != null) {
                pCur.next.random = pCur.random.next;
            }
            pCur = pCur.next.next;
        }
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        //拆分链表
        while(pCur!=null){
            pCur.next = pCur.next.next;
            if(cur.next!=null) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
            pCur = pCur.next;
        }
        return head; 
    }
}
