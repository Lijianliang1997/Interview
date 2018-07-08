package binarySearch;

/**
 * leetcode 33
 * @author lijianliang
 * @date 2018/7/7.
 */
public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int left, int right) {
        if (left == right) {
            if (nums[left] == target) {
                return left;
            } else {
                return -1;
            }
        }
        int mid = (left + right) / 2;
        if (nums[mid] >= nums[left]) {
            if (nums[left] <= target && target <= nums[mid]) {
                return binarySearch(nums, target, left, mid);
            } else {
                return search(nums, target, mid + 1, right);
            }
        } else {
            if (nums[mid] <= target && target <= nums[right]) {
                return binarySearch(nums, target, mid, right);
            } else {
                return search(nums, target, left, mid);
            }
        }
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        if (left == right) {
            if (nums[left] == target) {
                return left;
            } else {
                return -1;
            }
        }
        int mid = (left + right) / 2;
        if (target < nums[mid]) {
            return binarySearch(nums, target, left, mid);
        } else if (target == nums[mid]) {
            return mid;
        } else {
            return binarySearch(nums, target, mid + 1, right);
        }

    }
}
