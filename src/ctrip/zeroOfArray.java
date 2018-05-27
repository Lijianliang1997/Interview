package ctrip;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/29.
 */
public class zeroOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i ++) {
            nums[i] = in.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n; i ++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index ++;
            }
        }
        for (int i = index + 1; i < n; i ++) {
            nums[i] = 0;
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
