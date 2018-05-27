package graph;

/**
 * Created by qq940 on 2018/3/13.
 */
public class FindCircleNum {
    public int findCircleNum (int[][] M) {
        if (M == null) {
            return 0;
        }
        int m = M.length;
        int ret = 0;
        boolean[] hasFind = new boolean[m];
        for (int i = 0; i < m; i ++) {
            if (!hasFind[i]) {
                dfs(M, i, hasFind);
                ret ++;
            }
        }
        return ret;
    }

    private void dfs (int[][] M, int i , boolean[] hasFind) {
        hasFind[i] = true;
        int m = M.length;
        for (int k = 0; k < m; k ++) {
            if (M[i][k] == 1 && !hasFind[k]) {
                dfs(M, k, hasFind);
            }
        }
    }
}
