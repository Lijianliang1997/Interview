package jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by qq940 on 2018/4/9.
 */
public class Parentheses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int t = Integer.parseInt(in.nextLine());
            String[] strs = new String[t];
            for (int i = 0; i < t; i++) {
                strs[i] = in.nextLine();
            }
            for (String s : strs) {
                boolean flag = parentheses(s);
                if (flag) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    public static boolean parentheses (String s) {
        int len = s.length();
        int count = 0;
        if (len == 0 || len % 2  != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i ++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    count ++;
                } else {
                    stack.pop();
                }
            }
        }
        if (count <= 1){
            return true;
        }
        return false;
    }
}
