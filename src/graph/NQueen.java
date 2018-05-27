package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qq940 on 2018/5/19.
 */
public class NQueen {
    private List<List<String>> ret;
    private char[][] nQueens;
    private boolean[] colUsed;
    private boolean[] d45Used;
    private boolean[] d135Used;
    private int n;

    public List<List<String>> solveQueens(int n) {
        ret = new ArrayList<>();
        nQueens = new char[n][n];
        for (int i = 0; i < n; i ++) {
            Arrays.fill(nQueens[i] ,'.');
        }
        colUsed = new boolean[n];
        d45Used = new boolean[2 * n - 1];
        d135Used = new boolean[2 * n - 1];
        this.n = n;
        backtracking(0);
        return ret;
    }

    private void backtracking (int row) {
        if (row == n) {
            List<String> list = new ArrayList<>();
            for (char[] chars : nQueens) {
                list.add(new String(chars));
            }
            ret.add(list);
            return;
        }
        for (int col = 0; col < n; col ++) {
            int d45 = row + col;
            int d135 = n - 1 - (row - col);
            if (colUsed[col] || d45Used[d45] || d135Used[d135]) {
                continue;
            }
            nQueens[row][col] = 'Q';
            colUsed[col] = d45Used[d45] = d135Used[d135] = true;
            backtracking(row + 1);
            colUsed[col] = d45Used[d45] = d135Used[d135] = false;
            nQueens[row][col] = '.';
        }
    }
}
