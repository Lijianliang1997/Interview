package sort;

/**
 * Created by qq940 on 2018/1/29.
 */
public class SelectionSort {
    public static void selectionSort(Integer[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j ++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }
    public static void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // 测试Integer
        Integer[] a = {10,9,8,7,6,5,4,3,2,1};
        selectionSort(a);
        for( int i = 0 ; i < a.length ; i ++ ){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
