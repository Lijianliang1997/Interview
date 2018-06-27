package BinaryTree;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/3.
 */
public class BinaryTreeLevelOrder {
    public List<List<Integer>> levelOrder (TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        // 我们使用LinkedList来作为我的先入先出的队列
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<TreeNode, Integer>(root, 0));
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> front = queue.remove();
            TreeNode node = front.getKey();
            int level = front.getValue();
            if (level == res.size()) {
                res.add(new ArrayList<Integer>());
            }
            assert level <res.size();
            res.get(level).add(node.val);
            if (node.left != null) {
                queue.add(new Pair<TreeNode, Integer>(node.left, level + 1));
            }
            if (node.right != null) {
                queue.add(new Pair<TreeNode, Integer>(node.right, level + 1));
            }
        }
        return res;
    }

    public List<List<Integer>> levelOrder2 (TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        int depth = maxDepth(root);
        // 我们使用LinkedList来作为我的先入先出队列
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<TreeNode, Integer>(root, depth - 1));
        for (int i = 0; i < depth; i ++) {
            res.add(new ArrayList<>());
        }
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> front = queue.remove();
            TreeNode node = front.getKey();
            int level = front.getValue();
            assert level < res.size();
            res.get(level).add(node.val);
            if (node.left != null) {
                queue.add(new Pair<TreeNode, Integer>(node.left, level - 1));
            }
            if (node.right != null) {
                queue.add(new Pair<TreeNode, Integer>(node.right, level - 1));
            }
        }

        return res;
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
