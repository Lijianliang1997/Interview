package jd;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/9.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(palindrome(s));
    }

    public static int palindrome (String s) {
        int len = s.length();
        boolean[] deleted = new boolean[len];
        int count = 0;
        if (len == 1) {
            return 1;
        }
        for (int i = 0; i < len; i ++) {
            String temp = s.substring(0, i) + s.substring(i + 1, len);
            if (isPalindrome(temp)) {
                count ++;
            } else {
                count += palindrome(temp);
            }
        }
        return count;
    }

    private static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}
