package BinaryTree;

/**
 *  leetcode 222
 * @author qq940
 * @date 2018/6/4
 */
public class CountNode {
    public int countNodes (TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        }else {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }

    public int getRightHeight (TreeNode root) {
        int count = 0;
        while (root != null) {
            count ++;
            root = root.right;
        }
        return count;
    }

    public int getLeftHeight (TreeNode root) {
        int count = 0;
        while (root != null) {
            count ++;
            root = root.left;
        }
        return count;
    }
}
