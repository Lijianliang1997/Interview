package array;

/**
 * Created by qq940 on 2018/3/4.
 */
public class RemoveDuplicate {
    public int removeDuplicate (int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j ++) {
            if (nums[i] != nums[j]) {
                i ++;
                nums[i] = nums[j];
            }
        }
        return  i + 1;
    }
}
