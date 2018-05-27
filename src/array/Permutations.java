package array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/5.
 */
public class Permutations {
    private ArrayList<List<Integer>> res;
    private boolean[] used;

    public List<List<Integer>> permute (int[] nums) {
        res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        used = new boolean[nums.length];
        LinkedList<Integer> p = new LinkedList<Integer>();
        return res;
    }
    private void generatePermutation(int[] nums, int index, LinkedList<Integer> p) {

    }
}
