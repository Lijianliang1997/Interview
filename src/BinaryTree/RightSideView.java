package BinaryTree;

import java.util.*;

import static BinaryTree.ReConstructBinaryTree.reConstructBinaryTree;

/**
 * leetcode 199
 * @author lijianliang
 * @date 2018/7/4.
 */
public class RightSideView {
    class Pair{
        TreeNode treeNode;
        int level;

        public Pair(TreeNode treeNode, int level) {
            this.treeNode = treeNode;
            this.level = level;
        }

        public TreeNode getTreeNode() {
            return treeNode;
        }

        public int getLevel() {
            return level;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair now = queue.poll();
            if (now.getTreeNode().left != null) {
                queue.offer(new Pair(now.getTreeNode().left, now.getLevel() + 1));
            }
            if (now.getTreeNode().right != null) {
                queue.offer(new Pair(now.getTreeNode().right, now.getLevel() + 1));
            }
            Pair next = queue.peek();
            if (next != null && now.getLevel() < next.getLevel()) {
                res.add(now.getTreeNode().val);
            }
            if (queue.isEmpty()) {
                res.add(now.getTreeNode().val);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] pre = {1,2,5,3,4};
        int[] in = {2,5,1,3,4};
        TreeNode node = reConstructBinaryTree(pre, in);
        List<Integer> res = new RightSideView().rightSideView(node);
        System.out.println(Arrays.toString(res.toArray()));
    }
}
