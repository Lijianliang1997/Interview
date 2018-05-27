package setOrMap;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by qq940 on 2018/3/1.
 */
public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        if (k <= 0 ) {
            return false;
        }
        Set<Integer> record = new HashSet<>();
        for (int i = 0; i < nums.length; i ++) {
            if (record.contains(nums[i])) {
                return true;
            } else {
                record.add(nums[i]);
            }
            if (record.size() == k + 1) {
                record.remove(nums[i - k]);
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k, int t) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        if (k <= 0 ) {
            return false;
        }
        TreeSet<Long> record = new TreeSet<>();
        for (int i = 0; i < nums.length; i ++) {
            if(record.ceiling((long)nums[i] - (long)t) != null &&
                    record.ceiling((long)nums[i] - (long)t) <= (long)nums[i] + (long)t){
                return true;
            } else {
                record.add((long)nums[i]);
            }
            if (record.size() == k + 1) {
                record.remove((long)nums[i - k]);
            }
        }
        return false;
    }
}
