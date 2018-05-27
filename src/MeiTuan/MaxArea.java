package MeiTuan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/20.
 */
public class MaxArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i ++) {
            height[i] = in.nextInt();
        }
        int res = 0;
        int minH = 0;
        for (int i = 0; i < n; i ++) {
            minH = height[i];
            for (int j = i; j < n; j ++) {
                minH = Math.min(minH, height[j]);
                res = Math.max(res, minH * (j - i + 1));
            }
        }
        System.out.println(res);
    }
}
