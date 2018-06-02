package array;

/**
 * leetcode 34
 * @author ljl
 * @date 2018/6/1
 */
public class SearchForRange {
    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int l = 0 ;
        int r = nums.length - 1;
        int[] res = {-1, -1};
        int index = 0;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (r < l) {
            return res;
        }
        l = index;
        r = index;
        for (int i = index; i >= 0; i --) {
            if (nums[i] == target) {
                l = i;
            } else {
                break;
            }
        }
        for (int i = index; i < nums.length; i ++) {
            if (nums[i] == target) {
                r = i;
            } else {
                break;
            }
        }
        res[0] = l;
        res[1] = r;
        return res;
    }
}
