package dp;

/**
 * Created by qq940 on 2018/3/21.
 */
public class MaxProfit {
    public int maxProfit (int[] prices) {
        int maxEndingHere = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i ++) {
            maxEndingHere += prices[i] - prices[i - 1];
            maxEndingHere = Math.max(maxEndingHere, 0);
            max = Math.max(maxEndingHere, max);
        }
        return max;
    }

    public int profit2 (int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int n = prices.length;
        int[] buyDp = new int[n];
        int[] sellDp = new int[n];
        buyDp[0] = -prices[0];
        buyDp[1] = Math.max(-prices[0], -prices[1]);
        sellDp[1] = Math.max(0, prices[1] - prices[0]);
        int max = 0;
        for (int i = 2; i < n; i ++) {
            buyDp[i] = Math.max(buyDp[i - 1], sellDp[i - 2] - prices[i]);
            sellDp[i] = Math.max(sellDp[i - 1], buyDp[i - 1] + prices[i]);
        }
        return sellDp[n];
    }
}
