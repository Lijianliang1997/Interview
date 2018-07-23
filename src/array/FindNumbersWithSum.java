package array;

import java.util.ArrayList;

/**
 * @author lijianliang
 * @date 2018/7/23.
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (array == null || array.length == 0) {
            return res;
        }
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            if (array[l] + array[r] == sum) {
                res.add(array[l]);
                res.add(array[r]);
                break;
            }
            while (l < r && array[l] + array[r] > sum) {
                r --;
            }
            while (l < r && array[l] + array[r] < sum) {
                l ++;
            }
        }
        return res;
    }
}
