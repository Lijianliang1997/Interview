package dp;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/27.
 */
public class Crime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int t = in.nextInt();
            int c = in.nextInt();
            int[] crime = new int[n];
            for (int i = 0; i < n; i++) {
                crime[i] = in.nextInt();
            }
            System.out.println(crime(crime, n, t, c));
        }
    }

    public static int crime (int[] crime, int n, int t, int c) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= n - c; i ++) {
            sum = 0;
            for (int j = 0; j < c; j ++) {
                if (i + j >= n) {
                    break;
                }
                sum += crime[i + j];
                if (sum > t) {
                    sum = 0;
                    break;
                }
            }
            if (sum != 0) {
                count ++;
            }
        }
        return count;
    }
}
