package tecent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/5.
 */
public class Machine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] macs = new int[n][2];
        int[][] costs = new int[m][2];
        for (int i = 0; i < n; i ++) {
            macs[i][0] = in.nextInt();
            macs[i][1] = in.nextInt();
        }
        for (int i = 0; i < m; i ++) {
            costs[i][0] = in.nextInt();
            costs[i][1] = in.nextInt();
        }
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int pro1 = 200 * o2[0] + 3 * o2[1];
                int pro2 =200 * o1[0] + 3 * o1[1];
                if (pro1 == pro2) {
                    return o1[0] - o2[0];
                }
                return pro1 - pro2;
            }
        });
        Arrays.sort(macs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2 [0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        int count = 0;
        int profit = 0;
        boolean[] used = new boolean[n];
        for (int[] cost : costs) {
            for (int i = 0; i < n; i ++) {
                if (cost[0] <= macs[i][0] && cost[1] <= macs[i][1] && !used[i]) {
                    count ++;
                    used[i] = true;
                    profit += 200 * cost[0] + 3 * cost[1];
                    break;
                }
            }
        }
        System.out.println(count + " " + profit);
    }
}
