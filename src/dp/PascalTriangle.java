package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/5/25.
 */
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return res;
        }
        for (int j = 0; j < numRows; j ++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int i = 1; i < j; i ++) {
                List<Integer> prevRow = res.get(j - 1);
                int temp = prevRow.get(i - 1) + prevRow.get(i);
                row.add(temp);
            }
            if (j != 0) {
                row.add(1);
            }
            res.add(row);
        }
        return res;
    }
}
