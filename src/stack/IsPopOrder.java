package stack;

import java.util.Stack;

/**
 * Created by qq940 on 2018/3/3.
 */
public class IsPopOrder {
    public boolean isPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length!= popA.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (Integer num : pushA) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                stack.pop();
                index ++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 3, 2, 1};
        IsPopOrder isPopOrder = new IsPopOrder();
        System.out.println( isPopOrder.isPopOrder(a, b));
    }
}
