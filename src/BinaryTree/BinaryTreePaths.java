package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/4.
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (root.right == null && root.left == null) {
            res.add(Integer.toString(root.val));
            return res;
        }
        List <String> leftPaths = binaryTreePaths(root.left);
        for (String s : leftPaths) {
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(s);
            res.add(sb.toString());
        }
        List <String> rightPaths = binaryTreePaths(root.right);
        for (String s : rightPaths) {
            StringBuilder sb = new StringBuilder(Integer.toString(root.val));
            sb.append("->");
            sb.append(s);
            res.add(sb.toString());
        }
        return  res;
    }
}
