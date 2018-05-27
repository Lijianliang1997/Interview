package iqiyi;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/19.
 */
public class MaxSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int idx = -1;
        while (idx != len - 1) {
            idx = findMax(s, idx);
            sb.append(s.charAt(idx));
        }
        System.out.println(sb.toString());
    }


    public static int  findMax (String s, int start) {
        int len = s.length();
        int idx = start + 1;
        for (int i = start + 1; i < len; i ++) {
            int tmp = s.charAt(i) - 'a';
            int max = s.charAt(idx) - 'a';
            if (tmp > max) {
                idx = i;
            }
        }
        return idx;
    }
}
