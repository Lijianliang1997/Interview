package string;

/**
 * Created by qq940 on 2018/4/4.
 */
public class MinDistance {
    public int minDistance (String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= m; j ++) {
                dp[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1) ? dp[i - 1][j - 1] + 1 : Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return m + n - 2 * dp[n][m];
    }
}
