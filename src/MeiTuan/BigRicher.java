package MeiTuan;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/20.
 */
public class BigRicher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 6 || n < 1) {
            return;
        }
        System.out.println((int)Math.pow(2, n - 1));

    }
}
