package sort;

/**
 * Created by qq940 on 2018/1/29.
 */
public class BubbleSort {
    public static void bubbleSort(Integer[] array) {
        int n = array.length;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 1; i < n; i ++) {
                if (array[i - 1] > array [i]) {
                    swap(array, i-1, i);
                    swapped = true;
                }
            }
            n --;
        } while (swapped);
    }
    public static void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        // 测试Integer
        Integer[] a = {10,9,8,7,6,5,4,3,2,1};
        bubbleSort(a);
        for( int i = 0 ; i < a.length ; i ++ ){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
