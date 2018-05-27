package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/4/16.
 */
public class FindTarget {
    public boolean findTarget (TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        inOrder(root, nums);
        int i = 0;
        int j = nums.size() - 1;
        while (i < j) {
            int sum = nums.get(i) + nums.get(j);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                i ++;
            } else {
                j --;
            }
        }
        return false;
    }
    private void inOrder (TreeNode root, List<Integer> nums) {
        if (root == null) {
            return;
        }
        inOrder(root.left, nums);
        nums.add(root.val);
        inOrder(root.right, nums);
    }
}
