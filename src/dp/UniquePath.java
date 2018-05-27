package dp;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/3/21.
 */
public class UniquePath {
    public int uniquePath (int m, int n) {
        if (n <= 0 || m <= 0){
            return 0;
        }
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 1;
        Arrays.fill(dp[0], 1);
        for (int j = 0; j < m; j ++) {
            dp[j][0] = 1;
        }
        for (int i = 1; i < m; i ++) {
            for (int j = 1; j < n; j ++) {
                dp[i][j] = dp[i-1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public int uniquePath2 (int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 1;
        Arrays.fill(dp[0], 1);
        for (int j = 0; j < m; j ++) {
            dp[j][0] = 1;
        }
        for (int i = 1; i < m; i ++) {
            for (int j = 1; j < n; j ++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        UniquePath uniquePath = new UniquePath();
        System.out.println(uniquePath.uniquePath(3, 7));
    }
}
