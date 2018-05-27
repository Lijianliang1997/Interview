package array;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/5/23.
 */
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i ++) {
            if (row[i]) {
                for (int j = 0; j < n; j ++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i ++) {
            if (col[i]) {
                for (int j = 0; j < m; j ++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }



    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        SetZeroes setZeroes = new SetZeroes();
        setZeroes.setZeroes(arr);
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
