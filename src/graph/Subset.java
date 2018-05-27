package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/31.
 */
public class Subset {
//    public List<List<Integer>> subsets (int[] nums) {
//        List<List<Integer>> ret = new ArrayList<>();
//        List<Integer> subsetList = new ArrayList<>();
//        int size = nums.length;
//        for (int i = 0; i < size; i ++) {
//            backtracking(nums, i,0, subsetList, ret );
//        }
//        return ret;
//    }
//
//    public void backtracking (int[] nums, int size,int start, List<Integer> subsetList, List<List<Integer>> ret) {
//        if (subsetList.size() == size) {
//            ret.add(new ArrayList<>(subsetList));
//            return;
//        }
//        for (int i = start; i < nums.length; i ++) {
//            subsetList.add(nums[i]);
//            backtracking(nums, size, i + 1, subsetList, ret);
//            subsetList.remove(subsetList.size() - 1);
//        }
//    }

    public List<List<Integer>> subsets (int [] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> subsetList = new ArrayList<>();
        int size = nums.length;
        for (int i = 0; i < size; i ++) {
            backtracking(nums,i, 0, subsetList, ret);
        }
        return ret;
    }

    private void backtracking (int[] nums, int size, int start, List<Integer> subsetList, List<List<Integer>> ret) {
        if (subsetList.size() == size) {
            ret.add(new ArrayList<>(subsetList));
            return;
        }
        for (int i = start; i < nums.length; i ++) {
            subsetList.add(nums[i]);
            backtracking(nums, size, i + 1, subsetList,ret);
            subsetList.remove(subsetList.size() - 1);
        }
    }
}
