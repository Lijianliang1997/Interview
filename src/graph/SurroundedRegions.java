package graph;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/3/13.
 */

/**
 * 先填充最外面，这样就剩被包裹在里面的了
 */
public class SurroundedRegions {
    private int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    private int m, n;

    public void solve (char[][] board) {
        if (board == null || board.length == 0) return;
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i ++) {
            dfs(board, i, 0);
            dfs(board, i, n - 1);
        }
        for (int i = 0; i < n; i++) {
            dfs(board,0, i);
            dfs(board, m - 1, i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'T') board[i][j] = 'O';
                else if (board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        if (r <0 || r >= m || c< 0 || c >= n || board[r][c] != 'O') {
            return;
        }
        board[r][c] = 'T';
        for (int i = 0; i < direction.length; i ++) {
            dfs(board, r + direction[i][0], c + direction[i][1]);
        }
    }

}
