package greedy;

/**
 * Created by qq940 on 2018/3/9.
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        int pos = 0;
        for (int i = 0; i < s.length(); i ++, pos ++) {
            pos = t.indexOf(s.charAt(i), pos);
            if (pos == -1) {
                return false;
            }
        }
        return true;
    }
}
