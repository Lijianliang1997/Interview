package array;

/**
 * Created by qq940 on 2018/3/4.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j ++) {
            if (nums[j] == val) {
                i ++;
            }
        }
        return nums.length - i;
    }
}
