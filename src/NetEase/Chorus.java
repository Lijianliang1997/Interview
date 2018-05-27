package NetEase;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/2/4.
 */
public class Chorus {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int n = cin.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i ++) {
                arr[i] = cin.nextInt();
            }
            int K = cin.nextInt();
            int d = cin.nextInt();
            long[][] max = new long[K + 1][n + 1];// max[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最大乘积；
            long[][] min = new long[K + 1][n + 1];// max[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最小乘积；
            long res = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i ++){
                max[1][i] = arr[i];
                min[1][i] = arr[i];
                for (int k = 2; k <= K; k ++) {
                    for (int j = i - 1; j > 0 && i -j <= d; j --) {
                        max[k][i] = Math.max(max[k][i], Math.max(max[k - 1][j] * arr[i], min[k-1][j] * arr[i]));
                        min[k][i] = Math.min(min[k][i], Math.min(max[k - 1][j] * arr[i], min[k-1][j] * arr[i]));
                    }
                }
                res = Math.max(res ,max[K][i]);
            }
            System.out.println(res);
        }
    }
}
