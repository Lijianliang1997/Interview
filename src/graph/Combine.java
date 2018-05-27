package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static MeiTuan.MinInteger.used;

/**
 * Created by qq940 on 2018/4/17.
 */
public class Combine {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i ++) {
            arr[i - 1] = i;
        }
        dfs (arr, 0, k, ret, list);
        for (List<Integer> l : ret) {
            System.out.println(Arrays.toString(l.toArray()));
        }
    }

    public static void dfs (int[] arr, int start, int k, List<List<Integer>> ret, List<Integer> list) {
        if (k == 0) {
            ret.add(new ArrayList<>(list));
            return;
        }
        int n = arr.length;
        for	(int i = start; i < n - k + 1; i ++) {
            list.add (arr[i]);
            dfs (arr, i + 1, k - 1, ret, list);
            list.remove(list.size() - 1);
        }
    }
}
