package greedy;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/3/7.
 */
public class MinArrowShots {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            throw new IllegalArgumentException("points is illegal");
        }
        Arrays.sort(points, (a,b) -> a[1] - b[1]);
        int curPos = points[0][1];
        int ret = 1;
        for (int i = 0; i < points.length; i ++) {
            if (points[i][0] <= curPos) {
                continue;
            }
            curPos = points[i][1];
            ret ++;
        }
        return ret;
    }
}
