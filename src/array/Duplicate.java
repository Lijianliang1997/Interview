package array;

/**
 * @author lijianliang
 * @date 2018/7/29.
 */
public class Duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        boolean[] k = new boolean[length];
        for (int i = 0; i < length; i ++) {
            if (k[numbers[i]] == true) {
                duplication[0] = numbers[i];
                return true;
            }
            k[numbers[i]] = true;
        }
        return false;
    }
}
