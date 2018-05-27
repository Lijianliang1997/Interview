package BinaryTree;

/**
 * Created by qq940 on 2018/4/16.
 */
public class MergeTrees {
    public TreeNode mergeTrees (TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return null;
        }
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        TreeNode root = new TreeNode(node1.val + node2.val);
        root.left = mergeTrees(node1.left, node2.left);
        root.right = mergeTrees(node1.right, node2.right);
        return root;
    }
}
