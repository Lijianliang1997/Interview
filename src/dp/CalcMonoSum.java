package dp;

/**
 * Created by qq940 on 2018/3/28.
 */
public class CalcMonoSum {
    public static int calcMonoSum (int [] A, int n) {
        int count = 0;
        for (int i = 1; i < n; i ++) {
            for (int j = 0; j < i; j ++) {
                if (A[j] <= A[i]) {
                    count += A[j];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {461,533,323,533,320,191,167};
        System.out.println(calcMonoSum(A, 7));
    }
}
