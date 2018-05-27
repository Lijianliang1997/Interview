package bank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/10.
 */
public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n + 2];
        for (int i = 1; i<= n + 1; i ++) {
            dp[i] = i;
        }
        for (int i = 2; i <= n ;i ++) {
            if (i % 2 != 0) {
                dp[i] = Math.min(dp[i - 1], dp[i + 1]) + 1;
            } else {
                dp[i] = Math.min(Math.min(dp[i - 1], dp[i + 1]), dp[i / 2]) + 1;
            }
        }
        System.out.println(dp[n]);
    }
}
