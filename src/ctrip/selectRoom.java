package ctrip;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/29.
 */
public class selectRoom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int num = 3;
        int[][] rooms = new int [N][num + 1];
        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < num; j ++) {
                rooms[i][0] = in.nextInt();
                rooms[i][1] = in.nextInt();
                rooms[i][2] = in.nextInt();
                rooms[i][3] = i;
            }
        }
        int[] nums = new int[num];
        for (int i = 0; i < num; i ++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(rooms, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
    }
}
