package dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/27.
 */
public class Scholarship {
    public static int scholarship (int[][] arr,int n ,int r, int avg) {
        int base = 0;
        for (int [] a : arr){
            base += a[0];
        }
        int total = n * avg - base;
        int count = 0;
        for (int i = 0; i < n; i ++) {
            if (total <= 0) {
                break;
            }
            int tmp =  r - arr[i][0];
            if (total < tmp) {
                tmp = total;
            }
            total -= tmp;
            count += tmp * arr[i][1];
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int avg = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i <n; i ++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        System.out.println(scholarship(arr,n, r, avg));
    }
}
