package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lijianliang
 * @date 2018/7/24.
 */
public class IsContinuous {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        int maxn = -1, minn = 14;
        for (int n : numbers) {
            if (!set.add(n)  && n != 0) {
                return false;
            }
            if (n != 0) {
                maxn = Math.max(maxn, n);
                minn = Math.min(minn, n);
            }
        }
        if (maxn - minn <= 4) {
            return true;
        }
        return false;
    }
}
