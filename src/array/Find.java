package array;

/** 剑指offer第一题
 * @author lijianliang
 * @date 2018/7/8.
 */
public class Find {

    // 由于数组的左下角和右上角都有特殊性质,比如左下角的那个数上面的数比他小,右边的数比他大
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int rowCount = array.length;
        int colCount = array[0].length;
        int i = rowCount - 1;
        int j = 0;
        while (i >= 0 && j < colCount) {
            if (target == array[i][j]) {
                return true;
            }
            if (target < array[i][j]) {
                i --;
                continue;
            }
            if (target > array[i][j]) {
                j ++;
                continue;
            }
        }
        return false;
    }
}
