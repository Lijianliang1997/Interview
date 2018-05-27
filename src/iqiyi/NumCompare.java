package iqiyi;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/3.
 */
public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int sum1 = in.nextInt();
        int num2 = in.nextInt();
        int sum2 = in.nextInt();
        System.out.println(numCompare(num1, sum1, num2, sum2));
    }

    public static String numCompare(int num1, int sum1, int num2, int sum2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sum1; i ++) {
            sb1.append(num1);
        }
        for (int i = 0; i < sum2; i ++) {
            sb2.append(num2);
        }
        BigDecimal bigDecimal1 = new BigDecimal(sb1.toString());
        BigDecimal bigDecimal2 = new BigDecimal(sb2.toString());
        if (bigDecimal1.compareTo(bigDecimal2) < 0) {
            return "Less";
        } else if (bigDecimal1.compareTo(bigDecimal2) == 0) {
            return "Equal";
        } else {
            return "Greater";
        }
    }
}
