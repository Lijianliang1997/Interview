package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/14.
 */
public class permute {
    public List<List<Integer>> permute(int [] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ret;
        }
        List<Integer> permuteList = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtracking(permuteList, visited, nums, ret);
        return ret;
    }

    public void backtracking (List<Integer> permuteList, boolean[] visited, int [] nums, List<List<Integer>> ret) {
        if (permuteList.size() == nums.length) {
            ret.add(new ArrayList<>(permuteList));
            return;
        }
        for (int i = 0; i < visited.length; i ++) {
            if (visited[i] == true) {
                continue;
            }
            visited[i] = true;
            permuteList.add(nums[i]);
            backtracking(permuteList, visited, nums, ret);
            permuteList.remove(permuteList.size() - 1);
            visited[i] = false;
        }
    }
}
