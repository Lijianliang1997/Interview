package stack;

import java.util.Stack;

/**
 * Created by qq940 on 2018/1/1.
 */

/**
 *  用两个堆栈实现队列，一个栈作为存储用，另一个作为临时缓冲区
 *  入队时，将元素压入s1。
 *  出队时，判断s2是否为空，如不为空，则直接弹出顶元素；如为空，则将s1的元素逐个“倒入”s2，把最后一个元素弹出并出队。
 */
public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int result = stack2.pop();
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }
}
