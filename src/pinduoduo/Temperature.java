package pinduoduo;

import java.util.*;

/**
 * Created by qq940 on 2018/4/3.
 */
public class Temperature {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] temps = new int[n][2];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i ++) {
            temps[i][0] = in.nextInt();
            temps[i][1] = in.nextInt();
            max = Math.max(temps[i][1], max);
        }
        Arrays.sort(temps, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        int tMin = 0;
        int tMax = 0;
        boolean hasFind = false;
        for (int i = temps[0][0]; i <= max; i ++ ) {
            int count = 0;
            for (int[] temp : temps) {
                if (i>= temp[0] && i <= temp[1]) {
                    count ++;
                }
                if (count >= k) {
                    break;
                }
            }
            if (count >= k) {
                hasFind = true;
                tMin = i;
                break;
            }
        }
        for (int i = max; i >= temps[0][0]; i --) {
            int count = 0;
            for (int[] temp : temps) {
                if (i>= temp[0] && i <= temp[1]) {
                    count ++;
                }
                if (count >= k) {
                    break;
                }
            }
            if (count >= k) {
                hasFind = true;
                tMax = i;
                break;
            }
        }
        if (hasFind) {
            System.out.println(tMin + " " + tMax);
        } else {
            System.out.println("error");
        }
    }
}
