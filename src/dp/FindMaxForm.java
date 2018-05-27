package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qq940 on 2018/3/17.
 */
public class FindMaxForm {
    public int findMaxForm(String [] strs, int m, int n) {
        if (strs == null || strs.length == 0) return 0;
        int l = strs.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < l; i ++) {
            String s = strs[i];
            int ones = 0;
            int zeros = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeros++;
                else if (c == '1') ones++;
            }
            for (int j = m; j >= zeros; j --) {
                for (int k = n; k >= ones; k --) {
                    if (zeros <= j && ones <= k) {
                        dp[j][k] = Math.max(dp[j][k], dp[j - zeros][k - ones] + 1);
                    }
                }
            }
        }
        return  dp[m][n];
    }
}
