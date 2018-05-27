package setOrMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qq940 on 2018/3/1.
 */
public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i ++) {
            Map<Integer, Integer> record = new HashMap<>();
            for (int j = 0; j < points.length; j ++) {
                if (j != i) {
                    int dis = distance(points[i], points[j]);
                    if (record.containsKey(dis)) {
                        record.put(dis, record.get(dis) + 1);
                    } else {
                        record.put(dis, 1);
                    }
                }
            }
            for (Integer dis: record.keySet()) {
                res += record.get(dis) * (record.get(dis) - 1);
            }
            record.clear();
        }
        return res;
    }

    private static int distance(int[] pa, int pb[]) {
        return (pa[0] - pb[0]) * (pa[0] - pb[0]) +
                (pa[1] - pb[1]) * (pa[1] - pb[1]);
    }
}
