package bit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qq940 on 2018/4/15.
 */
public class MissingNumber {
    public int missingNumber (int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ret = 0;
        int n = nums.length;
        for (int i = 0; i < n; i ++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 1; i <= n; i ++) {
            if (!map.containsKey(i)) {
                ret = i;
                return ret;
            }
        }
        return ret;
    }

    public int missingNumber2 (int[] nums) {
        int ret = 0;
        int n = nums.length;
        for (int i = 0; i <= n; i ++) {
            ret = i == nums.length ? ret ^ i : ret ^ i ^ nums[i];
        }
        return ret;
    }
}
