package qunar;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/2.
 */
public class SellTickets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] tickets = new int[n];
        boolean[][] dp = new boolean[n][m + 1];
        for (int i = 0; i < n ; i ++) {
            tickets[i] = in.nextInt();
            dp[0][tickets[i]] = true;
        }
        for (int i = 1; i < n ; i ++) {
            for (int j = m; j >= tickets[i]; j --) {
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - tickets[i]];
            }
            for (int j = tickets[i - 1] - 1; j >= 0; j --) {
                dp[i][j] = dp[i - 1][j];
            }
        }
        if (dp[n - 1][m]) {
            System.out.println("perfect");
        } else {
            System.out.println("good");
        }
    }
}
