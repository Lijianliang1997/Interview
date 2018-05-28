package array;

/**
 * Created by qq940 on 2018/5/28.
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];
        int preMax;
        for (int i = 1; i < nums.length; i ++) {
            preMax = max;
            max = Math.max(Math.max(preMax * nums[i], nums[i]), nums[i] * min);
            min = Math.min(Math.min(preMax * nums[i], nums[i]), nums[i] * min);
            res = Math.max(res, max);
        }
        return res;
    }
}
