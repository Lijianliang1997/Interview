package ctrip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/29.
 */
public class arrayRotate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int [][] ret = null ;
        long start =  System.currentTimeMillis();
        while (in.hasNext() && in.hasNextLine()) {
            list.add(in.nextInt());
        }


        int n = (int) Math.sqrt(list.size());
        int[][] arrs = new int[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++, index++) {
                arrs[i][j] = list.get(index);
            }
        }
        int[][] rotated = new int[n][n];
        int d = n - 1;
        for (int i = 0; i < n; i++, d--) {
            for (int j = 0; j < n; j++) {
                rotated[j][d] = arrs[i][j];
            }
        }

        for (int[] arr : ret) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
