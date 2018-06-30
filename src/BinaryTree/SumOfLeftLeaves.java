package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *  leetcode 404
 * @author qq940
 * @date 2018/6/30
 */
public class SumOfLeftLeaves {
    class Pair {
        public TreeNode treeNode;
        public int direct; // 0 left 1 right or root

        public Pair(TreeNode treeNode,  int direct) {
            this.treeNode = treeNode;
            this.direct = direct;
        }

        public TreeNode getTreeNode() {
            return treeNode;
        }

        public int getDirect() {
            return direct;
        }
    }

    public int sumOfLeftLeaves (TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }
        Queue<Pair> queue = new LinkedList<>();
        Stack<Pair> stack = new Stack<>();
        Pair rootPair = new Pair(root,  1);
        queue.offer(rootPair);
        stack.add(rootPair);
        while (!queue.isEmpty()) {
            Pair tmp = queue.poll();
            TreeNode tNode = tmp.getTreeNode();
            if (tNode.left != null) {
                queue.add(new Pair(tNode.left, 0));
            }
            if (tNode.right != null) {
                queue.add(new Pair(tNode.right,  1));
            }
            if (tNode.left == null && tNode.right == null) {
                stack.add(new Pair(tNode, tmp.getDirect()));
            }
        }
        while (stack.size() > 1) {
            Pair tmp = stack.pop();
            if (tmp.getDirect() == 0) {
                res += tmp.getTreeNode().val;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] pre = {3,9,20, 15,7};
        int[] in = {9,3,15,20,7};
        TreeNode root = ReConstructBinaryTree.reConstructBinaryTree(pre, in);
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();
        System.out.println(sumOfLeftLeaves.sumOfLeftLeaves(root));
    }
}
