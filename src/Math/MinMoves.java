package Math;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/4/6.
 */
public class MinMoves {
    public int minMoves (int [] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int index = n / 2;
        int ret = 0;
        for (int num : nums) {
            ret += Math.abs(nums[index] - num);
        }
        return ret;
    }

    public static void main(String[] args) {
        MinMoves minMoves = new MinMoves();
        int[] arr = {1, 2, 3};
        System.out.println(minMoves.minMoves(arr));
    }
}
