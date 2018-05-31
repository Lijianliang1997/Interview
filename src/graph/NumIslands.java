package graph;

/**
 * Created by qq940 on 2018/3/13.
 */
public class NumIslands {
    int m ,n;
    private int[][] direction = {{1, 0}, {-1, 0}, {0, 1}, {0 ,-1}};
    public int numIslands (char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        boolean[][] hasFind = new boolean[m][n];
        int ret = 0;
        for (int i = 0; i <  m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (grid[i][j] == '1' && !hasFind[i][j]) {
                    dfs(grid, i, j, hasFind);
                    ret ++;
                }
            }
        }
        return ret;
    }

    private void dfs (char[][] grid, int i, int j, boolean[][] hasFind) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0' || hasFind[i][j]) {
            return;
        }
        if (grid[i][j] == '1') {
            hasFind[i][j] = true;
        }
        int m = grid.length;
        int n = grid[0].length;
        for (int k = 0; k < direction.length; k ++) {
            dfs(grid, i + direction[k][0], j + direction[k][1], hasFind);
        }
    }

    public static void main(String[] args) {
        NumIslands numIslands = new NumIslands();
        char[][] arrs = {{'1','1' ,'1' , '1', '0'},
                        {'1' ,'1' ,'0', '1', '0'},
                         {'1' ,'1' ,'0','0' ,'0'},
                        {'0', '0' ,'0' ,'1' ,'1'}};
        System.out.println(numIslands.numIslands(arrs));
    }
}
