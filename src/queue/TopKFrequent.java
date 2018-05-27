package queue;

import javafx.util.Pair;

import java.util.*;

/**
 * Created by qq940 on 2018/3/3.
 */
public class TopKFrequent {
    private class PairComparator implements Comparator<Pair<Integer, Integer>> {
        @Override
        public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2){
            if(p1.getKey() != p2.getKey())
                return p1.getKey() - p2.getKey();
            return p1.getValue() - p2.getValue();
        }
    }
    public List<Integer> topKFrequent (int[] nums, int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("k must be larger than 0");
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }
        if (k > freq.size()) {
            throw new IllegalArgumentException("k must be less than the number of unique numbers in nums");
        }
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(new PairComparator());
        for (Integer num : freq.keySet()) {
            int numFreq = freq.get(num);
            if (pq.size() == k) {
                if (numFreq > pq.peek().getKey()) {
                    pq.poll();
                    pq.add(new Pair(numFreq, num));
                }
            }else {
                pq.add(new Pair(numFreq, num));
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll().getValue());
        }
        return res;
    }
}
