package BinaryTree;

/**
 * Created by qq940 on 2018/4/16.
 */
public class TrimBST {
    public TreeNode trimBST (TreeNode root, int l, int r) {
        if (root == null) {
            return null;
        }
        if (root.val > r) {
            return trimBST(root.left, l, r);
        }
        if (root.val < l) {
            return trimBST(root.right, l , r);
        }
        root.left = trimBST(root.left, l, r);
        root.right = trimBST(root.right, l, r);
        return root;
    }
}
