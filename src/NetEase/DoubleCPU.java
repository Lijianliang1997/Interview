package NetEase;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/25.
 */
public class DoubleCPU {
    public static int doubleCPU (int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int ret = 0;
        int total = sum / 2;
        int[][] dp  = new int[n + 1][total + 1];
        for (int i = 0; i < n; i ++) {
            for (int j = 1; j <= total; j ++) {
                dp[i+1][j] = dp[i][j];
                if (nums[i] <= j && dp[i][j - nums[i]] + nums[i] > dp[i][j]) {
                    dp[i+1][j] = dp[i][j - nums[i]] + nums[i];
                }
            }
        }
        return sum - dp[n][sum / 2] ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i ++) {
            nums[i] = in.nextInt() / 1024;
        }
        System.out.println(doubleCPU(nums) * 1024);
    }
}
