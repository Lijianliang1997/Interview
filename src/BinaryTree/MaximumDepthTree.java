package BinaryTree;

/**
 * Created by qq940 on 2018/3/4.
 */
public class MaximumDepthTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
