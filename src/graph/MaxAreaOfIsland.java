package graph;

/**
 * Created by qq940 on 2018/3/12.
 */
public class MaxAreaOfIsland {
        public int maxAreaOfIsland(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int max = 0;
            for (int i = 0; i < m; i ++) {
                for (int j = 0; j < n; j ++) {
                    if (grid[i][j] == 1) {
                        max = Math.max(max, dfs(grid, i ,j));
                    }
                }
            }
            return max;
        }

        private int dfs (int[][] grid, int i, int j) {
            int m = grid.length - 1;
            int n = grid[0].length - 1;
            int max = 0;
            if (i > m || j >n || j < 0|| i < 0) {
                return 0;
            }
            if (grid[i][j] == 0) {
                return 0;
            }
            grid[i][j] = 0;
            return dfs(grid, i + 1, j) + dfs(grid, i - 1, j) + dfs(grid, i, j - 1) + dfs(grid, i , j + 1) + 1;
        }
}
