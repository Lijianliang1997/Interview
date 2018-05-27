package dp;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/29.
 */
public class IntegerBreak {
//    public static int integerBreak (int n) {
//        int[] dp = new int[n + 1];
//        dp[1] = 1;
//        for (int i = 2; i <= n; i ++) {
//            for (int j = 1; j <= i - 1; j ++) {
//                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
//            }
//        }
//        return dp[n];
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i < n + 1; i ++) {
            for (int j = 1; j <= i -1; j ++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        System.out.println(dp[n]);
    }
}
