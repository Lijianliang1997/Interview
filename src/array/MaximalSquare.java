package array;

/**
 * leetcode 221
 * @author qq940
 * @date 2018/6/2
 */
public class MaximalSquare {
    public int maximalSquare (char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int[][] arr = new int[len1][len2];
        int res = 0;
        for (int i = 0; i < len1; i ++) {
             if (matrix[i][0] == '1') {
                 arr[i][0] = 1;
                 res = 1;
             } else {
                 arr[i][0] = 0;
             }
        }
        for (int i = 0; i < len2; i ++) {
            if (matrix[0][i] == '1') {
                arr[0][i] = 1;
                res = 1;
            } else {
                arr[0][i] = 0;
            }
        }
        for (int i = 1; i < len1; i ++) {
            for (int j = 1; j < len2; j ++) {
                if (matrix[i][j] == '1') {
                    arr[i][j] = Math.min(arr[i - 1][j - 1], Math.min(arr[i - 1][j], arr[i][j-1])) + 1;
                    res = Math.max(res, arr[i][j]);
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return res * res;
    }
//    public int maximalSquare(char[][] matrix) {
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
//            return 0;
//        }
//        int len1 = matrix.length;
//        int len2 = matrix[0].length;
//        int sum=0;
//        int[][] arr= new int [len1][len2];
//        for(int i =0; i<len1;i++){
//            if(matrix[i][0] == 49)
//            {
//                arr[i][0]=1;
//                sum = 1;
//            }else{
//                arr[i][0]=0;
//            }
//        }
//        for(int i =0; i<len2;i++){
//            if(matrix[0][i] == 49)
//            {
//                arr[0][i]=1;
//                sum=1;
//            }else{
//                arr[0][i]=0;
//            }
//        }
//        for(int i=1; i<len1;i++){
//            for(int j=1; j<len2;j++){
//                if(matrix[i][j] == 49)
//                {
//                    arr[i][j]=Math.min(arr[i-1][j-1],Math.min(arr[i][j-1],arr[i-1][j]))+1;
//                    sum = Math.max(sum,arr[i][j]);
//                }else{
//                    arr[i][j]=0;
//                }
//            }
//        }
//        return sum*sum;
//    }
}
