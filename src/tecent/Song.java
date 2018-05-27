package tecent;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/5.
 */
public class Song {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int A = in.nextInt();
        int X = in.nextInt();
        int B = in.nextInt();
        int Y = in.nextInt();
        int n =X + Y;
        int[] dp = new int[K + 1];
        dp[0] = 1;
        int[] nums = new int[n];
        for (int i = 0; i < X; i ++) {
            nums[i] = A;
        }
        for (int i = X; i < n; i ++) {
            nums[i] = B;
        }
        for (int i = 0; i < n; i ++) {
            for (int j = K; j >= nums[i]; j --) {
                dp[j] = dp[j] + dp[j - nums[i]];
            }
        }
        System.out.println(dp[K]);
    }
}
