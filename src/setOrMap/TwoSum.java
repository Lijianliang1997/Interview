package setOrMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qq940 on 2018/2/27.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target ) {
        Map<Integer, Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int component = target - nums[i];
            if (!record.containsKey(component)) {
                record.put(nums[i], i);
            } else {
                int[] res = {i, record.get(component)};
                return res;
            }
        }
        throw new IllegalStateException("the input has no solution");
    }

    private static void printArr(int[] nums){
        for(int num: nums)
            System.out.print(num + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
        int target = 0;
        printArr((new TwoSum()).twoSum(nums, target));
}
}
