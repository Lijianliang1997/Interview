package tecent;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/23.
 */
public class Coin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    }

    public static int coin (int n) {
        int[] dp = new int[n + 1];
        int k = (int)Math.sqrt(n);
        int base = 1;
        int[] coin = new int[2*k];
        for (int i = 0; i < k; i ++) {
            coin[2*i] = base;
            coin[2*i + 1] = base;
            base *= 2;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        return 0;
    }
}
