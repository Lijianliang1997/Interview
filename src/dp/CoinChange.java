package dp;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/3/18.
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount];
        Arrays.fill(dp, amount);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++ ) {
            for (int j = 0; j < coins.length; j ++) {
                if (coins[j] <= i) {
                    dp[i] = Math.max(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? - 1 : dp[amount];
    }

    public int coinChange2(int[] coins, int amount) {
        int[] dp = new int[amount];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i =1; i <= amount; i ++) {
            for (int j = 0; j < coins.length; j ++) {
                dp[i] = Math.min(dp[i], dp[i - coins[j] + 1]);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        coinChange.coinChange(new int[]{1, 2}, 5);
    }
}
