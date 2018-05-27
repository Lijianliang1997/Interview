package dp;

/**
 * Created by qq940 on 2018/3/14.
 */
public class Bag {
    public int knapsack (int W, int N, int[] weights, int[] values) {
        int[][] dp = new int[N][W];
        for (int i = W - 1; i >= 0; i -- ) {
            dp[0][i] = i > weights[0]? values[0] : 0;
        }
        for (int i = 1; i < N; i ++) {
            for (int j = W - 1; j >= weights[i]; j --) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i]] + values[i]);
            }
            for (int j = weights[i - 1] - 1; j >= 0; j --) {
                dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[N - 1][W - 1];
    }
}
