package tree;

/**
 * Created by qq940 on 2018/2/19.
 */
public class TreeCreator {
    public TreeNode createSampleTree() {
        TreeNode root = new TreeNode('A');
        root.setLeft(new TreeNode('B'));
        root.setRight(new TreeNode('C'));
        root.getLeft().setLeft(new TreeNode('D'));
        root.getLeft().setRight(new TreeNode('E'));
        root.getRight().setRight(new TreeNode('F'));
        root.getLeft().getRight().setLeft(new TreeNode('G'));
        return root;
    }

    public TreeNode createTree (String preOrder, String inOrder) {
        if (preOrder.isEmpty()) {
            return null;
        }
        char rootValue = preOrder.charAt(0);
        int rootIndex = inOrder.indexOf(rootValue);

        TreeNode root = new TreeNode(rootValue);
        root.setLeft(createTree(preOrder.substring(1, rootIndex + 1), inOrder.substring(0, rootIndex)));
        root.setRight(createTree(preOrder.substring(rootIndex + 1), inOrder.substring(rootIndex + 1)));
        return root;
    }
}
