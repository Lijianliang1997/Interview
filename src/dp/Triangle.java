package dp;

import java.util.List;

/**
 * Created by qq940 on 2018/5/18.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        if (row == 0) {
            return 0;
        }
        int[][] res = new int[row][row]; //记录从第一行到每个点的最小值
        int minSum = Integer.MAX_VALUE;
        List<Integer> list0 = triangle.get(0);
        if (list0.size() == 0) {
            return 0;
        }
        if (row == 1) {
            return list0.get(0);
        }
        res[0][0] = list0.get(0);
        for (int i = 1; i < row; i ++) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < list.size(); j ++) {
                if (j == 0) {
                    res[i][j] = res[i - 1][0] + list.get(j);
                } else if (j == list.size() - 1) {
                    res[i][j] = res[i - 1][j - 1] + list.get(j);
                } else {
                    res[i][j]=Math.min(res[i-1][j-1],res[i-1][j])+list.get(j);
                }
                if (i == row - 1) {
                    if (minSum > res[i][j]) {
                        minSum = res[i][j];
                    }
                }
            }
        }
        return minSum;
    }
}
