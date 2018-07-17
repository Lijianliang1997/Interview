package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author lijianliang
 * @date 2018/7/17.
 */
public class UglyNumber {
    final int[] d =  {2, 3, 5};
    public int GetUglyNumber_Solution(int index) {
        if (index == 0) {
            return 0;
        }
        ArrayList<Long> list = new ArrayList();
        list.add(new Long(1));
        PriorityQueue<Long> queue = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < d.length; i ++) {
            queue.add(new Long(d[i]));
        }
        int count = 1;
        while (count != index) {
            Long tmp = queue.poll();
            if (!set.contains(tmp)) {
                list.add(tmp);
                set.add(tmp);
                count++;
            } else {
                continue;
            }
            for (int i = 0; i < d.length; i ++) {
                queue.add(tmp * d[i]);
            }
        }
        return list.get(index - 1).intValue();
    }

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        System.out.println(uglyNumber.GetUglyNumber_Solution(1500));
    }
}
