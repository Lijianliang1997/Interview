package greedy;

/**
 * Created by qq940 on 2018/3/8.
 */
public class NonDecreasingArray {
    public boolean checkPossibility (int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] < nums[i - 1]) {
                sum ++;
                if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                    nums[i] = nums[i - 1];
                }
                else {
                    nums[i - 1] = nums[i];
                }
            }
        }
        return sum <= 1;
    }

    public static void main(String[] args) {
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
        int[] arr = {3, 4, 2, 3};
        System.out.println(nonDecreasingArray.checkPossibility(arr));

    }
}
