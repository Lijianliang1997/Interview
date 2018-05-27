package dp;

/**
 * Created by qq940 on 2018/3/16.
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition (int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        sum = sum / 2;
        int n = nums.length;
        int[][] dp = new int[n][sum + 1]; // d[i][j]表示在取前i + 1个数字，在背包容量为j的情况下，最多能放多少东西
        for (int i = sum - 1 ; i >= n; i --) {
            dp[0][i] = i > nums[0] ? nums[0] : 0;
        }
        for (int i = 1; i < n; i ++) {
            for (int j = nums[i]; j <= sum; j ++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j -nums [i]] + nums[i]);
            }
        }
        if(dp[n-1][sum]==sum) {
            return true;
        }
        else {
            return false;
        }
    }
}
