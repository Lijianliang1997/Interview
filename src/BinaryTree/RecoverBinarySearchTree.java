package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 99
 * @author qq940
 * @date 2018/7/2
 */
public class RecoverBinarySearchTree {

    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;

    /**
     * 由于是一颗BST, 所以中序遍历是有序的,
     * 维护一个prev节点，该节点就是中序遍历时的前一个节点
     * ，然后将prev节点与当前结点比较，如果prev节点大于当前结点，说明存在问题，但并不肯定是这两个节点发生了互换。
     * 等全部节点遍历一遍之后，如果有两组发生错误的地方，那么就将第一组的第一个错误点和第二组的第二个错误点交换。
     * 如果只有一组发生错误，那就两个节点互换即可。
     * @param root
     */
    public void recoveryTree (TreeNode root) {
        inorder(root);
        int val = first.val;
        first.val = second.val;
        second.val = val;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (prev != null && prev.val > root.val) {
            if (first == null) {
                first = prev;
                second = root;
            } else {
                second = root;
            }
        }
        prev = root;
        inorder(root.right);
    }
}
