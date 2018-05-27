package pinduoduo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/3.
 */
public class MaxDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i ++) {
            nums[i] = in.nextInt();
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i <= n - k; i ++) {
            int r = i + k;
            int tmp = diff(i, r, nums);
            ret.add(tmp);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer num : ret) {
            sb.append(num +" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    public static int diff (int l, int r,int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = l; i < r; i ++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return max - min;
    }
}
