package BinaryTree;

/**
 * Created by qq940 on 2018/3/4.
 */
public class PathSum {
    public boolean hasPathSum (TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
