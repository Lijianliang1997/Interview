package BinaryTree;

/**
 * Created by qq940 on 2018/3/3.
 */
public class IsPostOrder {
    public boolean isPostOrder(int [] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        if (sequence.length == 1) {
            return true;
        }
        boolean flag = isBST(sequence, 0 ,sequence.length - 1);
        return flag;
    }

    public boolean isBST (int[] arr, int l, int r) {
        if (l >= r) {
            return false;
        }
        int cur  = arr[r];
        int splitIndex = l;
        while (arr[splitIndex] < cur) {
            splitIndex ++;
        }
        for (int i = splitIndex; i < r; i ++) {
            if (arr[i] < cur) {
                return false;
            }
        }
        return isBST(arr, l, splitIndex - 1) && isBST(arr, splitIndex, r - 1);
    }
}
