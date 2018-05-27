package sort;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/2/1.
 */
public class QuickSort {
    public static void quickSort(Integer[]  array){
        int n = array.length;
        sort(array, 0 , n -1);
    }
    private static int partition(Integer[] array, int l, int r) {
        int v = array[l];
        int j = l;
        for (int i = l + 1; i <= r; i ++) {
            if (array[i] < v) {
                j ++;
                swap(array, j, i);
            }
        }
        swap(array, l , j);
        return j;
    }

    public static void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // 递归使用快速排序,对arr[l...r]的范围进行排序
    private static void sort(Integer[] arr, int l, int r){

        if( l >= r )
            return;

        int p = partition(arr, l, r);
        sort(arr, l, p-1 );
        sort(arr, p+1, r);
    }
    // 测试 QuickSort
    public static void main(String[] args) {

        // Quick Sort也是一个O(nlogn)复杂度的算法
        // 可以在1秒之内轻松处理100万数量级的数据
        int N = 10;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

        return;
    }
}
