package array;

/**
 * Created by qq940 on 2018/5/23.
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0, c = n - 1;
        while (r< m && c >= 0) {
           if (target == matrix[r][c]) {
               return true;
           } else if (target < matrix[r][c]) {
               c --;
           } else {
               r ++;
           }
        }
        return false;
    }
}
