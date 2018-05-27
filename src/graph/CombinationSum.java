package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/31.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> combineList = new ArrayList<>();
        doCombine(candidates, target, 0, combineList, ret);
        return ret;
     }

     public void doCombine (int[] candidates, int target,int start, List<Integer> combineList, List<List<Integer>> ret) {
        if (target == 0) {
            ret.add(new ArrayList<>(combineList));
            return;
        } else if (target < 0) {
            return;
        }
        for (int i =  start; i < candidates.length; i ++) {
            combineList.add(candidates[i]);
            doCombine(candidates, target - candidates[i], i, combineList, ret);
            combineList.remove(combineList.size() - 1);
        }
     }

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int[] nums = {2, 3, 6, 7};
        List<List<Integer>> ret = combinationSum.combinationSum(nums, 7);
        System.out.println(ret.toString());
    }
}
