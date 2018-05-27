package iqiyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/19.
 */
public class ThreeInteger {
    public static int[][] dirs = {{1,0,1},{1, 1, 0},{0, 1, 1},{2, 0 ,0},{0, 2, 0},{0,0, 2}};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        if (A == B && B == C) {
            System.out.println(0);
            return;
        }
        int max = Math.max(A, Math.max(B, C));
        int min = Math.min(A, Math.min(B, C));
        int len = max + 3;
        int[][][] dp = new int[len][len][len];
        for (int[] dir : dirs) {
            dp[A + dir[0]] [B + dir[1]] [C + dir[2]] = 1;
        }
        for (int i = A; i < len; i ++) {
            for (int j = B; j < len; j ++) {
                for (int k = C; k < len; k ++) {
                    int minDp = Integer.MAX_VALUE;
                    for (int[] dir : dirs) {
                        int x = i - dir[0];
                        int y = j - dir[1];
                        int z = k - dir[2];
                        if (x > 0 && y > 0 && z > 0) {
                            int num = dp[x][y][z];
                            if (num != 0) {
                                minDp = Math.min(min, num);
                            }
                        }
                    }
                    if (minDp != Integer.MAX_VALUE) {
                        dp[i][j][k] = minDp + 1;
                    }
                }
            }
        }
        for (int i = max; i < len; i ++) {
            int num = dp[i][i][i];
            if (num > 0) {
                System.out.println(num);
                break;
            }
        }
    }
}
