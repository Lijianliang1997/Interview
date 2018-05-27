package array;

/**
 * Created by qq940 on 2018/1/1.
 */
public class MinNumberInRotateArray {
    public static int minNumberInRotateArray(int [] array) {
        if (array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = left;
        while(array[left] >= array[right]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = left + (right - left) / 2;
            // 如果下标为left， right， mid指向的三个数字相等
            //  则只能顺序查找
            if (array[left] == array [right]
                    && array[left] == array[mid])  {
                return searchInOrder(array, left, right);
            }
            if (array[mid] >= array[left]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return array[mid];
    }

    public static int searchInOrder(int[] array, int left, int right) {
        int result = array[left];
        for (int i = left +1; i < right; i ++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,1,1,1,2,1};
        System.out.println(minNumberInRotateArray(array));
    }
}
