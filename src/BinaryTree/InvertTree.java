package BinaryTree;

/**
 * Created by qq940 on 2018/4/16.
 */
public class InvertTree  {
    public TreeNode invertTree (TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }
}
