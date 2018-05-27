package loop;

import common.Node;

/**
 * Created by qq940 on 2018/2/19.
 */
public class LinkedListDeletor<T> {
    public Node<T> deleteIfEquals (Node<T> head, T value) {
        while (head != null && head.getNext().getValue() == value) {
            head = head.getNext();
        }
        if (head == null) {
            return null;
        }
        Node prev = head;
        // loop invariant: list nodes from head up to prev has been processed
        while (prev.getNext() != null) {
            // prev.getNext() == null
            if (prev.getNext().getValue() == value) {
                // delete it
                prev.setNext(prev.getNext().getNext());
            } else {
                prev = prev.getNext();
            }
        }
        return head;
    }
}
