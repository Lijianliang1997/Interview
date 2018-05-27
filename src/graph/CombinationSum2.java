package graph;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qq940 on 2018/3/31.
 */
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> combineList = new ArrayList<>();
        Arrays.sort(candidates);
        boolean[] visted = new boolean[candidates.length];
        doCombine(candidates, target, 0, combineList, ret, visted);
        return ret;
    }

    public void doCombine (int[] candidates, int target, int start, List<Integer> combineList, List<List<Integer>> ret, boolean[] visited) {
        if (target == 0) {
            ret.add(new ArrayList<>(combineList));
            return;
        } else if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i ++) {
            if (i != 0 && candidates[i] == candidates[i - 1] && !visited[i - 1]) {
                continue;
            }
            if (visited[i]) {
                continue;
            }
            if (candidates[i] <= target) {
                combineList.add(candidates[i]);
                visited[i] = true;
                doCombine(candidates, target - candidates[i], i + 1, combineList, ret,visited);
                combineList.remove(combineList.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum2 combinationSum2 = new CombinationSum2();
        int[] nums = {1, 2, 3, 1};
        List<List<Integer>> ret = combinationSum2.combinationSum2(nums, 2);
        System.out.println(ret.toString());
    }
}
