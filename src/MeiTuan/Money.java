package MeiTuan;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/20.
 */
public class Money {
    private static int[] money = {1, 5, 10, 20, 50, 100};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int j = 0; j < money.length;  j ++) {
            for (int i = 1; i <= n; i ++) {
                if (i >= money[j]) {
                    dp[i] = dp[i] +  dp[i - money[j]];
                }
            }
        }
        System.out.println(dp[n]);;
    }
}
