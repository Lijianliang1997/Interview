package NetEase;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/27.
 */
public class Biscuit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int len = s.length();
        int n = in.nextInt();
        long[][] dp = new long[len + 1][n];
        // dp[i][j]表示前i位（高位开始）余数为j的个数
        dp[0][0] = 1;
        for (int i = 0; i < len; i ++) {
            for (int j = 0; j < n; j ++) {
                if (s.charAt(i) == 'X') {
                    for (int k = 0; k <= 9; k ++) {
                        dp[i + 1][(j * 10 + k) % n] += dp[i][j];
                    }
                } else {
                    dp[i + 1][(j * 10 + s.charAt(i) - '0') % n] += dp[i][j];
                }
            }
        }
        System.out.println(dp[len][0]);
        in.close();
    }
}
