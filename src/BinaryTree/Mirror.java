package BinaryTree;

/**
 * Created by qq940 on 2018/1/7.
 */
public class Mirror {
    public void  Mirror (TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.right == null && node.left == null) {
            return;
        }
        reverse(node);
        if (node.left != null) {
            Mirror(node.left);
        }
        if (node.right != null) {
            Mirror(node.right);
        }
    }
    public void reverse (TreeNode node) {
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
    }

    public static void main(String[] args) {
        TreeNode tree8 = new TreeNode(8);
        TreeNode tree9 = new TreeNode(9);
        TreeNode treeX = new TreeNode(2);
        tree8.left = tree9;
        tree8.right = treeX;
        System.out.println(tree8.val);
//        reverse(tree8);
        System.out.println(tree8.val);
    }
}
