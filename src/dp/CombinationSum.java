package dp;

/**
 * Created by qq940 on 2018/3/18.
 */
public class CombinationSum {
    public int combinationSum4 (int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i ++) {
            for (int j = 0; j < nums.length; j ++) {
                if(nums[j] <= i) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }

    public int combinationSum (int [] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i  = 1; i <= target; i ++) {
            for (int j = 0; j < nums.length; j ++) {
                if (nums[j] <= i) {
                    dp[i] += dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
}
