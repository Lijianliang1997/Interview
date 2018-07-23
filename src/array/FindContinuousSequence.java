package array;

import java.util.ArrayList;

/**
 * @author lijianliang
 * @date 2018/7/23.
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int l = 1;
        int r = 2;
        while (l < r) {
            int cur = (l + r) * (r - l + 1) / 2; // 等差数列求和公式
            if (cur < sum) {
                r ++;
            }
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = l; i <= r; i ++) {
                    list.add(i);
                }
                res.add(list);
                l ++;
            }
            if (cur > sum) {
                l ++;
            }
        }
        return res;
    }
}
