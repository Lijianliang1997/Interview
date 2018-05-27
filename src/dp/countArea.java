package dp;

/**
 * Created by qq940 on 2018/3/27.
 */
public class countArea {
    public static void main(String[] args) {
        int [] A = { 2, 7, 9 , 4 ,1};
        int n = 5;
        System.out.println(countArea(A, n));
    }
    public static int countArea(int[] A, int n) {
        // write code here
        int res = 0;
        int minH = 0;
        for (int i = 0; i < n; i ++) {
            minH = A[i];
            for (int j = i ; j < n; j ++) {
                minH = Math.min(minH, A[j]);
                res = Math.max(res, minH * (j - i +1));
            }
        }
        return res;
    }
}
