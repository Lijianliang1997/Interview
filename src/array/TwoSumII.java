package array;

/**
 * Created by qq940 on 2018/3/11.
 */
public class TwoSumII {
    public int[] twoSum (int[] numbers, int target) {
        if (numbers == null && numbers.length == 0) {
            return null;
        }
        int l = 0;
        int r = numbers.length  - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                return new int[]{l + 1, r + 1};
            }else if (sum < target) {
                l ++;
            }else if (sum > target) {
                r --;
            }
        }
        return null;
    }
}
