package MeiTuan;

import java.util.*;

/**
 * Created by qq940 on 2018/3/22.
 */
public class MinInteger {
    public static boolean[] used;
    public static int minInteger (String s1) {
        int n = s1.length();
        boolean found = false;
        for (int i = 1;; i ++) {
            char[] tempArr = Integer.toString(i).toCharArray();
            int len = tempArr.length;
            used = new boolean[n];
            for (int j = 0; j < len; j ++) {
                char num = tempArr[j];
                int index = foundUnused(s1, num);
                if (index < 0) {
                    return i;
                } else {
                    continue;
                }
            }
        }
    }

    public static int foundUnused (String s1, char c1) {
        int n = s1.length();
        for (int i = 0; i < n; i ++) {
            if (s1.charAt(i) == c1 && used[i] == false) {
                used[i] = true;
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        System.out.println(minInteger(s1));
    }
}
