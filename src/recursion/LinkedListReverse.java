package recursion;

import common.Node;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by qq940 on 2018/2/18.
 */
public class LinkedListReverse {
    /**
     * Reverse a linked list
     * @param head of the linked list to reverse
     * @return head of the reversed linked list
     */
    public Node reverseLinkedList(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node newHead =  reverseLinkedList(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        LinkedListReverse reverse = new LinkedListReverse();
        Node.printLinkedList(reverse.reverseLinkedList(creator.createLinkedList(new ArrayList<>())));
        Node.printLinkedList(reverse.reverseLinkedList(creator.createLinkedList(Arrays.asList(1))));
        Node.printLinkedList(reverse.reverseLinkedList( creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));
    }
}
