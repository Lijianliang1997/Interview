package iqiyi;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/19.
 */
public class Candy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] candies = new int[n][2];
        int min = 0;
        int max = 0;
        int t = 1;
        for (int i = 0; i < n; i ++) {
            int l = in.nextInt();
            int r = in.nextInt();
            candies[i][0] = l;
            candies[i][1] = r;
            min += l;
            max += r;
            t *= (r - l + 1);
        }
        if (min > m) {
            System.out.println(0);
            return;
        }
        if (max < m) {
            System.out.println(t);
            return;
        }
        System.out.println(divide(candies, 0, m, n));
    }

    public static int divide (int[][] candies, int start, int res, int n) {
        if (res == 0 && start == n) {
            return 1;
        }
        if (start == n) {
            return 0;
        }
        int ret = 0;
        int l = candies[start][0];
        int r = candies[start][1];
        for (int j = l; j <= r; j ++) {
            ret += divide(candies, start + 1, res - j, n);
        }
        return ret;
    }
}
