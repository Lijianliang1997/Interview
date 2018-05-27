package sort;

/**
 * Created by qq940 on 2018/1/29.
 */
public class ShellSort {
    public static void shellSort(Integer[] array) {
        int n = array.length;
        // 计算increment sequence
        int h = 1;
        while (h < n/3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i =  h; i < n; i ++) {
                int e = array[i];
                int j = i;
                for (; j >= h && (e < array[j - h]); j -= h) {
                    array[j] = array[j - h];
                }
                array[j] = e;
            }
            h /= 3;
        }
    }
    public static void main(String[] args) {
        // 测试Integer
        Integer[] a = {10,9,8,7,6,5,4,3,2,1};
        shellSort(a);
        for( int i = 0 ; i < a.length ; i ++ ){
            System.out.print(a[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
