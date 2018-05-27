package dp;

/**
 * Created by qq940 on 2018/5/13.
 */
public class WiggleSubsequence {
    /**
     * 从序列的长度对应关系可以看出

     [1,17,5,10,13,15,10,5,16,8]对应的wiggle sequence长度是

     [1, 2, 3, 4,  4,  3,  5, 5, 6, 6]，可以发现连续的升序或者降序（局部升序或者降序>=3个元素），长度不再增加，按照这个思路，可以得到一个

     O(N)的贪心策略解法
     * @param nums
     * @return
     */
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int count = 1;
        Boolean prevInc = null;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] > nums[i - 1] && (prevInc == null || !prevInc)) {
                prevInc = true;
                count ++;
            } else if (nums[i] < nums[i - 1] && (prevInc == null || prevInc)) {
                prevInc = false;
                count ++;
            }
        }
        return count;
    }

    public int wiggleMaxLength2 (int[] nums) {
        int len = nums.length;
        if (len < 1) {
            return len;
        }
        int[][] dp = new int[len][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        for (int i = 1; i < len; i ++) {
            int a = Integer.MIN_VALUE;
            int b = Integer.MIN_VALUE;
            for (int k = i - 1; k >= 0; k --) {
                if (nums[i] > nums[k]) {
                    a = Math.max(a, dp[k][1]);
                } else if (nums[i] < nums[k]) {
                    b = Math.max(b, dp[k][0]);
                }
            }
            dp[i][0]=(a>Integer.MIN_VALUE?a+1:1);
            dp[i][1]=(b>Integer.MIN_VALUE?b+1:1);
        }
        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }
}
