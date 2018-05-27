package stack;

import java.util.Stack;

/**
 * Created by qq940 on 2018/3/24.
 */
public class DailyTemperatures {
    public int[] dailyTemperatures (int[] temperatures) {
        int n = temperatures.length;
        int[] ret = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i ++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.add(i);
        }
        return ret;
    }
}
