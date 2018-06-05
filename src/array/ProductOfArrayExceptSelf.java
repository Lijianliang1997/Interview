package array;

/**
 * leetcode 238
 * @author qq940
 * @date 2018/6/5
 */
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        res[0] = 1;
        for (int i = 0; i < len; i ++) {
            res[i + 1] = res[i] * nums[i];
        }
        int temp = 1;
        for (int i = len - 2; i >= 0; i --) {
            temp = temp * nums[i + 1];
            res[i] = res[i] * temp;
        }
        return res;
    }
}
