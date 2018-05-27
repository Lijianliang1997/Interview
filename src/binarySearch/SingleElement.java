package binarySearch;

/**
 * Created by qq940 on 2018/3/7.
 */
public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("the length of nums must be larger than 0");
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l ) / 2;
            if (mid % 2 == 1) {
                mid --;
            }
            if (nums[mid] == nums[mid + 1]) {
                l = mid + 2;
            } else {
                r = mid;
            }
        }
        return nums[l];
    }
}
