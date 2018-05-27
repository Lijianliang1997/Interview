package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/31.
 */
public class Combinations {
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

    public static void main(String[] args) {
        Combinations combinationSum = new Combinations();
        List<List<Integer>> ret = combinationSum.combine(4, 3);
        System.out.println(ret.toString());
    }
}
