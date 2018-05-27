package setOrMap;

import ali.Inter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qq940 on 2018/3/25.
 */
public class LongestHarmoniousSubSequence {
    public int findLHS (int [] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                result = Math.max(map.get(key) + map.get(key + 1), result);
            }
        }
        return result;
    }
}
