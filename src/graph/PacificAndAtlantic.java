package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/13.
 */
public class PacificAndAtlantic {
    private int m, n;
    private int[][] matrix;
    private int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> ret = new ArrayList<>();
        if (matrix == null  || matrix.length == 0) {
            return ret;
        }
        this.m = matrix.length;
        this.n = matrix[0].length;
        this.matrix = matrix;
        boolean[][] canReachP = new boolean[m][n];
        boolean[][] canReachA = new boolean[m][n];
        for (int i = 0; i < m; i ++) {
            dfs(i, 0, canReachP);
            dfs(i, n - 1, canReachA);
        }
        for (int i = 0; i < n; i ++) {
            dfs(0, i, canReachP);
            dfs(m - 1, i , canReachA);
        }
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (canReachA[i][j] && canReachP[i][j]) {
                    ret.add(new int[] {i, j});
                }
            }
        }
        return ret;
    }

    private void dfs (int r, int c, boolean[][] canReach) {
        if (canReach[r][c]) {
            return;
        }
        canReach[r][c] = true;
        for (int i = 0; i < direction.length; i ++) {
            int nextR = direction[i][0] + r;
            int nextC = direction[i][1] + c;
            if (nextR < 0 || nextR >= m || nextC <0 || nextC>= n || matrix[r][c] > matrix[nextR][nextC]) {
                continue;
            }
            dfs(nextR, nextC, canReach);
        }
    }

    public static void main(String[] args) {
        PacificAndAtlantic pacificAndAtlantic = new PacificAndAtlantic();
        int[][] matrix = {{1, 2,2,3,5} , {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        List<int[]> list = pacificAndAtlantic.pacificAtlantic(matrix);
        System.out.println(list.toString());
    }
}
