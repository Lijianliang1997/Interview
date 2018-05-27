package sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qq940 on 2018/4/4.
 */
public class TopKFrequentEle {
    public List<Integer> topKFrequent (int []nums, int k) {
        List<Integer> ret = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> [] bucket = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        for (int i = bucket.length - 1; i >= 0 && ret.size() < k; i --) {
            if (bucket[i] != null) {
                ret.addAll(bucket[i]);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        TopKFrequentEle topKFrequentEle = new TopKFrequentEle();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k =2;
        List<Integer> ret = topKFrequentEle.topKFrequent(nums, k);
        System.out.println(ret.toString());
    }
}
