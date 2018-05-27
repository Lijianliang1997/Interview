package sort;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/1/30.
 */
public class MergeSort {
    public static void mergeSort(Integer[] array) {
        int n = array.length;
        mergeSort(array, 0, n-1);
    }
    public static void mergeSort(Integer[] array, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(array, l ,mid);
        mergeSort(array, mid + 1, r);
        merge(array, l , mid, r);
    }
    public static void merge(Integer[] array, int l, int mid, int r) {
        Integer[] temp = Arrays.copyOfRange(array, l, r + 1);
        // 初始化，i 指向左半边的起始位置， j 指向右半边的起始位置
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k ++) {
            if (i > mid) {
                array[k] = temp[j - l];
                j ++;
            } else if (j > r) {
                array[k] = temp[i - l];
                i ++;
            } else if (temp[i - l] < temp[j - l]) {
                array[k] = temp[i - l];
                i ++;
            } else {
                array[k] = temp[j - l];
                j ++;
            }
        }
    }
}
