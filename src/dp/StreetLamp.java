package dp;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/28.
 */
public class StreetLamp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int l = in.nextInt();
            Integer[] lamps = new Integer[n];
            for (int i = 0; i < n; i ++) {
                lamps[i] = in.nextInt();
            }
            Arrays.sort(lamps, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            int max = 0;
            for (int i = 0; i < n - 1; i++) {
                int tmp = lamps[i + 1] - lamps[i];
                max = Math.max(tmp, max);
            }
            max = ((lamps[0] - 0) * 2 > max) ? (lamps[0] - 0) * 2 : max;
            max = ((l - lamps[n - 1]) * 2 > max) ? (l - lamps[n - 1]) * 2 : max;
            BigDecimal tmp = new BigDecimal((max *1.0) / 2);
            System.out.println(tmp.setScale(2));
        }
    }
}
