package greedy;

/**
 * Created by qq940 on 2018/3/7.
 */
public class MaxProfit {
    public int maxProfit (int[] prices) {
        int profit = 0;
        for (int i = 1 ; i < prices.length; i ++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
