package NetEase;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/27.
 */
public class NumPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(numPair(n, k));
    }

    public static int numPair (int n, int k) {
        int count = 0;
        for (int i = k; i <= n; i ++) {
            if (i >= k) {
                count += n - i;
            }
            for (int j = k + 1; j < i; j ++) {
                if (i % j >= k) {
                    count ++;
                }
            }

        }
        return count;
    }
}
