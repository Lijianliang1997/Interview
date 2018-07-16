package array;

/**
 * @author lijianliang
 * @date 2018/7/16.
 */
public class FindGreatestSum {
    public int FindGreatestSumOfSubArray(int[] array) {
        int res = 0;
        int curSum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i ++) {
            if (curSum <= 0) {
                curSum = array[i];
            } else {
                curSum += array[i];
            }
            if (curSum > res) {
                res = curSum;
            }
        }
        return res;
    }
}
