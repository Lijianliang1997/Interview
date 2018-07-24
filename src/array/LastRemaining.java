package array;

import java.util.ArrayList;

/**
 * @author lijianliang
 * @date 2018/7/24.
 */
public class LastRemaining {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0) {
            return -1;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            res.add(i);
        }
        int tmpIndex = (m - 1) % res.size();
        while (res.size() != 1) {
            res.remove(tmpIndex);
            tmpIndex = (tmpIndex - 1 + m) % res.size();
        }
        return res.get(0);
    }
}
