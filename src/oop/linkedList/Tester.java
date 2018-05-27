package oop.linkedList;

/**
 * Created by qq940 on 2018/2/21.
 */
public class Tester {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i ++) {
            linkedList.add(i);
        }
        for (Integer value: linkedList) {
            System.out.println(value);
        }
    }
}
