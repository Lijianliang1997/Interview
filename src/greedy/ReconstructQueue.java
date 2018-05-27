package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**为了在每次插入操作时不影响后续的操作，身高较高的学生应该先做插入操作，否则身高较小的学生原先正确插入第 k 个位置可能会变成第 k+1 个位置。

 身高降序、k 值升序，然后按排好序的顺序插入队列的第 k 个位置中。
 * Created by qq940 on 2018/3/11.
 */
public class ReconstructQueue {
    public int[][] reconstructQueue (int[][] people) {
        if(people == null || people.length == 0 || people[0].length == 0) return new int[0][0];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o2[0] - o1[0];
            }
        });
        int n = people.length;
        List<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < n ; i ++) {
            tmp.add(people[i][1], people[i]);
        }
        int[][] ret = new int[n][2];
        for(int i = 0; i < n; i++) {
            ret[i][0] = tmp.get(i)[0];
            ret[i][1] = tmp.get(i)[1];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] arr = {{7,0}, {4, 4}, {7 , 1}, {5, 0},{6,1}, {5,2}};
        ReconstructQueue reconstructQueue = new ReconstructQueue();
        reconstructQueue.reconstructQueue(arr);
    }
}
