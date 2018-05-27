package dp;

/**
 * Created by qq940 on 2018/3/21.
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = nums[0];
        max = sum;
        for (int i = 1; i < nums.length; i ++) {
            sum = (sum + nums[i] > nums[i]) ? (sum + nums[i]) : nums[i];
            max = sum > max ? sum : max;
        }
        return max;
    }
}
