package dp;

/**
 * Created by qq940 on 2018/5/20.
 */
public class RepeatedSubarray {
    public int findLength (int[] A, int[] B) {
        int res = 0;
        int len1 = A.length;
        int len2 = B.length;
        int [][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <len1; i ++) {
            for  (int j = 0; j <len2; j ++) {
                if (A[i] == B[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                }
                res = Math.max(res, dp[i + 1][j + 1]);
            }
        }
        return res;
    }
}
