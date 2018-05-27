package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by qq940 on 2018/3/11.
 */
public class GenerateParentheses {
    public static List<String> generate(int n) {
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        parenthesis(list,s,n,n);
        return list;
    }
    public static void parenthesis(ArrayList<String> list,String s,Integer left,Integer right) {
        if (left == 0 && right == 0) {
            list.add(s);
        }

        if (left > 0) {
            parenthesis(list, s + '(', left - 1, right);
        }

        if (right > 0 && left < right) {
            parenthesis(list,s+')',left,right-1);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> list = new ArrayList<>();
        list = generate(n);
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s +",");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
