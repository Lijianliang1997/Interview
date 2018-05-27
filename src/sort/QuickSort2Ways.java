package sort;

/**
 * Created by qq940 on 2018/2/26.
 */
public class QuickSort2Ways {
    private QuickSort2Ways(){};

    private static int partition(Integer[] arr, int l, int r) {
        swap(arr, l, (int)(Math.random() * (r - l + 1)) + l);
        int v = arr[l];
        int i = l + 1, j = r;
        while (true) {
            while (i <= r && arr[i] < v) {
                i ++;
            }
            while (j >= l + 1 && arr[j] > v) {
                j --;
            }
            if (i > j) {
                break;
            }
            swap(arr, i , j);
            i ++;
            j --;
        }
        swap(arr, l ,j);
        return j;
    }

    private static void sort(Integer[] arr, int l, int r) {
        if( l >= r ) {
            return;
        }
        int p = partition(arr, l, r);
        sort(arr, l, p-1 );
        sort(arr, p+1, r);
    }
    private static void sort(Integer[] arr) {
        int n = arr.length;
        sort(arr, 0, n - 1);
    }
    public static void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        // 测试Integer
        Integer[] a = {10,9,8,7,6,5,4,3,2,1};
        sort(a);
        for( int i = 0 ; i < a.length ; i ++ ){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
