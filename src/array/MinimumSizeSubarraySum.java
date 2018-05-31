package array;

/**
 * Created by qq940 on 2018/5/31.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            while (sum >= s) {
                min = Math.min(min, i - l + 1);
                sum -= nums[l];
                l ++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        int[] arr = {2, 3, 1, 2, 4, 3 ,1};
        System.out.println(minimumSizeSubarraySum.minSubArrayLen(7, arr));
    }
}
