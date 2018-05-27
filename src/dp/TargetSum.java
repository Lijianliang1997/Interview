package dp;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/3/16.
 */
public class TargetSum {
    public int findTargetSumWays (int[] nums, int S) {
        int sum = 0;
        int n = nums.length;
        for (int num : nums) {
            sum += num;
        }
        if (sum <S || (sum + S) % 2 == 1) {
            return 0;
        }
        return subsetSum(nums, (sum + S) >> 1);
    }

    private int subsetSum (int[] nums, int targetSum) {
        Arrays.sort(nums);
        int[] dp = new int[targetSum + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i ++) {
            int num = nums[i];
            for (int j = targetSum; j >= num; j --) {
                dp[j] = dp[j] + dp[j - num];
            }
        }
        return dp[targetSum];
    }

    public static void main(String[] args) {
        TargetSum targetSum = new TargetSum();
        int[] arr = {1, 1, 1, 1, 1};
        System.out.println(targetSum.findTargetSumWays(arr, 3)) ;
    }
}
