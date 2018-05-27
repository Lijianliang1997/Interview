package NetEase;

import java.util.*;

/**
 * Created by qq940 on 2018/3/27.
 */
public class WorkMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] works = new int[n][2];
        int[] mems = new int[m];
        for (int i = 0; i < n; i ++) {
            works[i][0] = in.nextInt();
            works[i][1] = in.nextInt();
        }
        for (int i = 0; i < m; i ++) {
            mems[i] = in.nextInt();
        }
        Arrays.sort(works, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        maxMoney(works, mems);
    }

    public static void maxMoney (int[][] works, int[] mems) {
        for (int mem : mems) {
            for (int[] work : works) {
                if (mem >= work[0]) {
                    System.out.println(work[1]);
                    break;
                }
            }
        }
    }
}
