package dp;

/**
 * Created by qq940 on 2018/3/28.
 */
public class Visit {
    public int countPath (int[][] map, int n, int m) {
        int startX = 0;
        int startY = 0;
        int endX =  0;
        int endY = 0;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i ++) {
            for (int j =0; j <m; j ++) {
                if (map[i][j] == 1) {
                    startX = i;
                    startY = j;
                    continue;
                }
                if (map[i][j] == 2) {
                    endX = i;
                    endY = j;
                }
            }
        }
        int xto = startX > endX ? -1 : 1;
        int yto = startY > endY ? -1 : 1;
        // 初始化边界
        dp[startX][startY] = 1;
        for (int i = startX + xto; i != endX + xto; i += xto) {
            dp[i][startY] = map[i][startY] == 1 ? 0 : dp[i - xto][startY];
        }
        for (int i = startY + yto; i != endY + yto; i += yto) {
            dp[startX][i] = map[startX][i] == 1 ? 0 : dp[startX][i - yto];
        }
        // 动态规划
        for (int i = startX + xto; i != endX + xto; i += xto) {
            for (int j = startY + yto; j != endY + yto; j += yto) {
                dp[i][j] = map[i][j] == -1 ? 0 : dp[i - xto][j] + dp[i][j - yto];
            }
        }
        return dp[endX][endY];
    }
}
