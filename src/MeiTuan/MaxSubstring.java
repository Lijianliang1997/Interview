package MeiTuan;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/20.
 */
public class MaxSubstring {
    private int maxSubstring (String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int result = 0;
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i ++) {
            for (int j = 1; j <= len2; j ++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(dp[i][j], result);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        MaxSubstring maxSubstring = new MaxSubstring();
        System.out.println(maxSubstring.maxSubstring(s1, s2));
    }
}
