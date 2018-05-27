package BinaryTree;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/1/1.
 */
public class ReConstructBinaryTree {

    /**
     * 前序遍历第一个是根节点， 与中序遍历比对一下，找到根节点，确认左子树和右子树
     * @param pre
     * @param in
     * @return
     */
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length != in.length) {
            return null;
        }
//        System.out.println(Arrays.toString(pre));
//        System.out.println(Arrays.toString(in));
        if (pre.length == 0) {
            return null;
        }
        TreeNode tree = new TreeNode(pre[0]);
        if (pre.length == 1) {
            return tree;
        }

        for (int i = 0; i < in.length; i ++) {
            if (in[i] == pre[0]) {
                tree.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1 , i + 1), Arrays.copyOfRange(in, 0 , i));
                tree.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1 , pre.length), Arrays.copyOfRange(in, i , in.length));
            }
          }
        return tree;
    }
    public static void pre(TreeNode treeNode) {
            System.out.println(treeNode.val);
            if (treeNode.left != null) {
                pre(treeNode.left);
            }
            if (treeNode.right != null) {
                pre(treeNode.right);
            }
    }

    public static void main(String[] args) {
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        TreeNode node = reConstructBinaryTree(pre, in);
    }
}
