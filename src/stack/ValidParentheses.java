package stack;

import java.util.Stack;

/**
 * Created by qq940 on 2018/3/2.
 */
public class ValidParentheses {
    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character c = stack.pop();
                Character match = null;
                if (s.charAt(i) == ')') {
                    match = '(';
                } else if (s.charAt(i) == ']') {
                    match = '[';
                } else if (s.charAt(i) == '}') {
                    match = '{';
                }
                if (c != match) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("(){}[]"));
    }
}
