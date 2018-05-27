package webank;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/16.
 */
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long n = in.nextLong();
            int count = 0;
            for (long i = 0; i <= n; i ++) {
                if (isPalindrome(i)) {
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
    private static boolean isPalindrome(long num) {
        String s = Long.toBinaryString(num);
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
