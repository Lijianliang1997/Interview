package stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by qq940 on 2018/3/25.
 */
public class NextGreaterElement2 {
    public int[] nextGreaterElements (int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        Arrays.fill(next, -1);
        Stack<Integer> stack  = new Stack<>();
        for (int i = 0; i < 2 * n ; i ++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                next[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }
        return next;
    }
}
