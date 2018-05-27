package pinduoduo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/3.
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n ; i ++) {
            points[i][0] = in.nextInt();
            points[i][1] = in.nextInt();
        }
        Triangle triangle = new Triangle();
        int k = 3;
        List<List<Integer>> lists =  triangle.combine(n, k);
        int count = 0;
        for (List<Integer> list : lists) {
            boolean flag = isTriangle(list.get(0) - 1, list.get(1) - 1, list.get(2) - 1, points);
            if (flag) {
                count ++;
            }
        }
        System.out.println(count);
    }

    public static boolean isTriangle (int i , int j, int k, int[][] points) {
        int x1 = points[i][0] - points[j][0];
        int x2 = points[i][0] - points[k][0];
        int y1 = points[i][1] - points[j][1];
        int y2 = points[i][1] - points[k][1];
        int res = x1 * y2 - x2 * y1;
        if (res == 0) {
            return false;
        } else {
            return true;
        }
    }

    public List<List<Integer>> combine (int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> combineList = new ArrayList<>();
        backtracking(combineList, n, k , 1, ret);
        return ret;
    }

    public void backtracking (List<Integer> combineList, int n, int k, int start, List<List<Integer>> ret) {
        if (k == 0) {
            ret.add(new ArrayList<>(combineList));
            return;
        }
        for (int i = start; i <= n - k + 1; i ++) {
            combineList.add(i);
            backtracking(combineList, n , k - 1 , i + 1, ret);
            combineList.remove(combineList.size() - 1);
        }
    }
}
