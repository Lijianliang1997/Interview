package BinaryTree;

import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

import static BinaryTree.ReConstructBinaryTree.reConstructBinaryTree;

/**
 * Created by qq940 on 2018/3/3.
 */
public class LevelOrder {
    public static ArrayList<Integer> levelOrder (TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        // 我们使用LinkedList来作为我的先入先出的队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            res.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        TreeNode node = reConstructBinaryTree(pre, in);
        System.out.println(levelOrder(node).toString());
    }
}
