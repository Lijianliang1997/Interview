package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/21.
 */
public class PerfectSquare {
    public int numSquares (int n) {
        List<Integer> squares = new ArrayList<>();
        int square = 1;
        int diff = 3;
        while  (square <= n) {
            squares.add(square);
            square += diff;
            diff += 2;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 1; i <= n; i ++) {
            int min = Integer.MAX_VALUE;
            for (int s : squares) {
                if (s > i) {
                    break;
                }
                min = Math.min(min, dp[i - s] + 1);
            }
            dp[i] = min;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        PerfectSquare perfectSquare = new PerfectSquare();
        System.out.println(perfectSquare.numSquares(1));
    }
}
