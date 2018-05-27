package greedy;

/**
 * Created by qq940 on 2018/5/12.
 */
public class GasStation {
    public int canCompleteCircuit (int[] gas, int[] cost) {
        int n = cost.length;
        int sum = 0;
        int total = 0;
        int j = -1;
        for (int i = 0; i < n; i ++) {
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (sum < 0) {
                j = i;
                sum = 0;
            }
        }
        if (total <0 ) {
            return -1;
        } else {
            return j + 1;
        }
    }
}
