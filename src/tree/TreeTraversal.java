package tree;

/**
 * Created by qq940 on 2018/2/19.
 */
public class TreeTraversal {

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getValue());
        inOrder(root.getRight());
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue());
    }

    public String postOrder(String preOrder, String inOrder) {
        if (preOrder.isEmpty()) {
            return "";
        }
        char rootValue = preOrder.charAt(0);
        int rootIndex = inOrder.indexOf(rootValue);

        return postOrder(preOrder.substring(1, rootIndex + 1), inOrder.substring(0, rootIndex)) +
        postOrder(preOrder.substring(rootIndex + 1), inOrder.substring(rootIndex + 1)) +
                rootValue;
    }

    public static void main(String[] args) {
        TreeCreator creator = new TreeCreator();
        TreeTraversal traversal = new TreeTraversal();
        TreeNode sampleTree = creator.createSampleTree();
        traversal.preOrder(sampleTree);
        System.out.println();
        traversal.inOrder(sampleTree);
        System.out.println();
        traversal.postOrder(sampleTree);
        System.out.println();
        System.out.println("=================");
        TreeNode tree = creator.createTree("ABDEGCF", "DBGEACF");
        traversal.postOrder(tree);
        System.out.println();
        System.out.println(traversal.postOrder("ABDEGCF", "DBGEACF"));
        System.out.println();
    }
}
