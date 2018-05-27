package sort;

/**
 * Created by qq940 on 2018/1/29.
 */
public class InsertionSort {
    public static void insertionSort(Integer[] array) {
        int n = array.length;
        for (int i = 0; i < n; i ++) {
            for (int j = i; j > 0; j --) {
                if (array[j] < array[j - 1]) {
                    swap(array, j , j - 1);
                } else {
                    break;
                }
            }
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
        insertionSort(a);
        for( int i = 0 ; i < a.length ; i ++ ){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
