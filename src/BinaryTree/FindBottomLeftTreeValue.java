package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  leetcode 513
 * @author qq940
 * @date 2018/6/8
 */
public class FindBottomLeftTreeValue {
    int ret = 0;
    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return ret;
        }
        bfs(root);
        return ret;
    }

    private void bfs (TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        ret = root.val;
        int curNum = 1;
        int nextNum = 0;
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            curNum--;
            if (node.left != null) {
                q.offer(node.left);
                nextNum++;
            }
            if (node.right != null) {
                q.offer(node.right);
                nextNum++;
            }
            if (curNum == 0) {
                // 当下一层不空的时候，第一个结点就是最左侧结点
                if (!q.isEmpty()) {
                    ret = q.peek().val;
                }
                curNum = nextNum;
                nextNum = 0;
            }
        }
    }
}
