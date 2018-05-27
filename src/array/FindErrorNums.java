package array;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/4/4.
 */
public class FindErrorNums {
    public int[] findErrorNums (int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i ++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                swap (nums, i , nums[i] - 1);
            }
        }
        for (int i = 0; i < n; i ++) {
            if (nums[i] != i + 1) {
                return new int[] {nums[i], i + 1};
            }
        }
        return null;
    }

    private void swap (int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = nums[i];
    }
}
