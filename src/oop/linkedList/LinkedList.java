package oop.linkedList;

import common.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by qq940 on 2018/2/21.
 */
public class LinkedList<T> implements Iterable<T> {

    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void add(T value) {
        Node<T> node = new Node<T>(value);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }
    class ListIterator<T> implements Iterator<T> {
        Node<T> curNode;

        public ListIterator(Node head) {
            this.curNode = head;
        }

        @Override
        public boolean hasNext() {
            if (curNode == null) {
                return false;
            }
            return true;
        }

        @Override
        public T next() {
            if (curNode == null) {
                throw new NoSuchElementException();
            }
            T value = curNode.getValue();
            curNode = curNode.getNext();
            return value;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(head);
    }
}
