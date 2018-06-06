package BinaryTree;


import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *  leetcode 95 96
 * @author qq940
 * @date 2018/5/21
 */
public class UniqueBinarySearchTree {
    public int numTrees (int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int [] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2;i <= n; i ++) {
            for (int j = 0; j < i; j ++) {
                nums[i] += nums[j] * nums[i - j - 1];
            }
        }
        return nums[n];
    }

    public List<TreeNode> generateTrees (int n) {
        List<TreeNode> res = new ArrayList<>();
        if (n < 1) {
            return res;
        }
        return generateSubTree(1, n);
    }

    public List<TreeNode> generateSubTree (int start, int end) {
        List<TreeNode> res = new ArrayList<>();
        if (start > end) {
            res.add(null);
            return res;
        }
        for (int i = start; i <= end; i ++) {
            List<TreeNode> left = generateSubTree(start, i - 1);
            List<TreeNode> right = generateSubTree(i + 1, end);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
