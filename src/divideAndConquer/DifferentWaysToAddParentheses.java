package divideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/23.
 */
public class DifferentWaysToAddParentheses {
    public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> ret = new ArrayList<>();
        int n = input.length();
        for (int i = 0; i < n ; i ++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        switch (c){
                            case '+' : ret.add(l + r); break;
                            case '-' : ret.add(l - r); break;
                            case '*' : ret.add(l * r); break;
                        }
                    }
                }
            }
        }
        if (ret.size() == 0) {
            ret.add(Integer.valueOf(input));
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "2*3-4*5";
        System.out.println(diffWaysToCompute(s));
    }
}
