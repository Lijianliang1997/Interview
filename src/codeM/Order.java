package codeM;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/5/28.
 */
public class Order {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] goods = new int[n][2];
        for (int i = 0; i < n; i++) {
            goods[i][0] = in.nextInt();
            goods[i][1] = in.nextInt();
        }
        int[][] onSale = new int[m][2];
        for (int i = 0; i < m; i++) {
            onSale[i][0] = in.nextInt();
            onSale[i][1] = in.nextInt();
        }
        Arrays.sort(onSale, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });
        double sum1 = 0;
        double sum2 = 0;
        for (int[] good : goods) {
            if (good[1] == 1) {
                sum1 += good[0] * 0.8;
            } else {
                sum1 += good[0];
            }
            sum2 += good[0];
        }
        for (int[] sale : onSale) {
            if (sum2 > sale[0]) {
                sum2 -= sale[1];
                break;
            }
        }
        double sum = Math.min(sum1, sum2);
        System.out.println(String.format("%.2f", sum));
    }
}
