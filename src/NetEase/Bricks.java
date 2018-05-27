package NetEase;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/26.
 */
public class Bricks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = in.nextInt();
        }
        System.out.println(brick(arr));
    }

    public static int brick (int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int height = sum / 2;
        int[][] dp = new int[n + 1][height + 1];
        for (int i = 0 ; i < n; i ++) {
            for (int j = 1; j < height; j ++) {
                dp[i + 1][j] = dp[i][j];
                if (arr[i] < j && dp[i + 1][j - arr[i]] + arr[i] > dp[i][j]) {
                    dp[i + 1][j] = dp[i + 1][j - arr[i]] + arr[i];
                }
            }
        }
        return dp[n][height];
    }
}
