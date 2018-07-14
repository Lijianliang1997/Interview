package BinaryTree;

import java.util.Stack;

/**
 * @author lijianliang
 * @date 2018/7/14.
 */
public class Convert {
    public TreeNode Convert(TreeNode root) {
            if (root == null) {
                return null;
            }
            Stack<TreeNode> stack = new Stack<>();
            TreeNode p = root;
            // 用于保留中序遍历的上一节点
            TreeNode pre = null;
            boolean isFirst = true;
            while (p != null || !stack.isEmpty()) {
                while (p != null) {
                    stack.push(p);
                    p = p.left;
                }
                p = stack.pop();
                if (isFirst) {
                    root = p;
                    pre = root;
                    isFirst = false;
                } else {
                    pre.right = p;
                    p.left = pre;
                    pre = p;
                }
                p = pre.right;
            }
            return root;
    }
}
