package iqiyi;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by qq940 on 2018/4/3.
 */
public class Parenthesis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(depth(str));
    }

    public static int depth (String str) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            }
            max = Math.max(max, stack.size());
        }
        return max;
    }
}
