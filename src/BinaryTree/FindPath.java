package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijianliang
 * @date 2018/7/14.
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        dfs(res, new ArrayList<>(), target, root);
        return res;
    }

    public void dfs (ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int target, TreeNode root) {
        list.add(root.val);
        if (root.left == null && root.right == null) {
            if (target == root.val) {
                res.add(list);
            }
            return;
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        if (root.left != null) {
            dfs(res, list, target - root.val, root.left);
        }
        if (root.right != null) {
            dfs(res, list2, target - root.val, root.right);
        }
    }

}
