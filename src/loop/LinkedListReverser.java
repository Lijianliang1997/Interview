package loop;

import common.Node;
import recursion.LinkedListCreator;
import recursion.LinkedListReverse;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by qq940 on 2018/2/19.
 */
public class LinkedListReverser {
    public Node reverseLinkedList(Node head) {
        Node newHead = null;
        Node curHead = head;
        // Loop invariant
        // newHead points to the linked list already reversed
        // curHead points to the linked list not yet reversed
        while (curHead != null) {
            Node next = curHead.getNext();
            curHead.setNext(newHead);
            newHead = curHead;
            curHead = next;
        }
        // loop invariant holds
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListCreator creator = new LinkedListCreator();
        LinkedListReverse reverse = new LinkedListReverse();
        Node.printLinkedList(reverse.reverseLinkedList(creator.createLinkedList(new ArrayList<>())));
        Node.printLinkedList(reverse.reverseLinkedList(creator.createLinkedList(Arrays.asList(1))));
        Node.printLinkedList(reverse.reverseLinkedList( creator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5))));
        Node.printLinkedList(reverse.reverseLinkedList( creator.createLargeLinkedList(1000)));
    }
}
