package greedy;

import java.util.List;

/**
 * Created by qq940 on 2018/3/7.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        boolean[] used = new boolean[s.length];
        if (g == null || g.length == 0 || s == null || s.length == 0) {
            return res;
        }
        for (int i = 0; i < g.length; i ++) {
            for (int j = 0; j < s.length; j ++ ) {
                if (used[j] == false && s[j] >= g[i]) {
                    res ++;
                    used[j] = true;
                    break;
                }
            }
        }
        return res;
    }
}
