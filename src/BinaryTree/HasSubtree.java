package BinaryTree;

/**
 * Created by qq940 on 2018/1/7.
 */
//todo
public class HasSubtree {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return ifSubtree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);

    }
    public static boolean ifSubtree(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if (node1 == null) {
            return false;
        }
        if (node1.val == node2.val) {
            return ifSubtree(node1.left, node2.left) && ifSubtree(node1.right, node2.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(8);
        TreeNode tree2 = new TreeNode(8);
        TreeNode tree3 = new TreeNode(7);
        TreeNode tree4 = new TreeNode(9);
        TreeNode tree5 = new TreeNode(3  );
        TreeNode tree6 = new TreeNode(4);
        TreeNode tree7 = new TreeNode(7);
        TreeNode tree8 = new TreeNode(8);
        TreeNode tree9 = new TreeNode(9);
        TreeNode treeX = new TreeNode(2);
        tree5.left = tree6;
        tree5.right = tree7;
        tree2.right = tree5;
        tree2.left = tree4;
        tree1.left = tree2;
        tree1.right = tree3;
        tree8.left = tree9;
        tree8.right = treeX;
        if (HasSubtree(tree1, tree8)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
