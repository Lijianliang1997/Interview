package tecent;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/5.
 */
public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(num2(n, m));
        in.close();
    }

    public static int num (int n, int m) {
        int ret = m * m * ( n / (2 * m ));
        return ret;
    }

    public static int num2 (int n, int m) {
        boolean flag = false;
        int sum = 0;
        for (int i = 1; i <= n ; i ++) {
            if (flag) {
                sum += i;
            }  else {
                sum -= i;
            }
            if (i % m == 0) {
                flag = !flag;
            }
        }
        return sum;
    }
}
