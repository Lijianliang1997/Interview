package stack;

import java.util.Stack;

/**
 * Created by qq940 on 2018/5/25.
 */
public class SimplifyPath {
    public String simplifyPath (String path) {
        if (path == null || path.length() == 0) {
            return path;
        }
        Stack<String> stack = new Stack<>();
        String[] list = path.split("/");
        for (int i = 0; i < list.length; i ++) {
            if (list[i].equals(".") || list[i].length() == 0) {
                continue;
            } else if (!list[i].equals("..")){
                stack.push(list[i]);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Stack<String> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        while (!temp.isEmpty()) {
            sb.append("/" + temp.pop());
        }
        if (sb.length() == 0) {
            sb.append("/");
        }
        return sb.toString();
    }
}
