package number;

/**
 * @author lijianliang
 * @date 2018/7/21.
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int index = findK(array, k);
        int count = 0;
        for (int i = index; i < array.length && array[i] == k; i ++) {
            count ++;
        }
        for (int i = index - 1; i >= 0 && array[i] == k; i --) {
            count ++;
        }
        return count;
    }

    public int findK (int[] array, int k) {
        int len = array.length;
        int l = 0;
        int r = len - 1;
        int mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (array[mid] == k) {
                break;
            } else if (array[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return mid;
    }
}
