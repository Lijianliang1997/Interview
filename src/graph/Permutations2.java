package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qq940 on 2018/3/31.
 */
public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> permuteList = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        backtracking(permuteList,visited, nums, ret);
        return ret;
    }

    private void backtracking (List<Integer> permuteList, boolean[] visited, int[] nums, List<List<Integer>> ret) {
        if (permuteList.size() == nums.length) {
            ret.add(new ArrayList<>(permuteList));
            return;
        }
        for (int i = 0; i <visited.length; i ++) {
            if (i != 0 && nums[i] == nums[i - 1] && !visited[i-1]) {
                continue;
            }
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            permuteList.add(nums[i]);
            backtracking(permuteList, visited, nums, ret);
            permuteList.remove(permuteList.size() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Permutations2 permutations2 = new Permutations2();
        int[] nums = {1, 1, 2};
        List<List<Integer>> ret = permutations2.permuteUnique(nums);
        System.out.println(ret.toString());
    }
}
