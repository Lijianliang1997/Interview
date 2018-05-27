package array;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/3/11.
 */
public class NextPermutation {
    public void nextPermutation (int[] nums) {
        int r = nums.length - 1;
        while (r >= 1 && nums[r] < nums[r - 1]) {
            r --;
        }
        if (r > 0) {
            int index = nums.length - 1;
            while ( index >= 0 && nums[index] <= nums[r - 1]) {
                index --;
            }
            swap(nums, r - 1 ,index);
        }
        reverse(nums, r);
    }

    private void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i , j);
            i ++;
            j --;
        }
    }
    private void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        NextPermutation nextPermutation = new NextPermutation();
        int[] arr = {1, 5, 1};
        nextPermutation.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
