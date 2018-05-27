package sort;

import java.util.PriorityQueue;

/**
 * Created by qq940 on 2018/4/4.
 */
public class FIndKthLargest {
    public int findKthLargest (int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
