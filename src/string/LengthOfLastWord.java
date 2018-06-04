package string;

/**
 * leetcode 58
 * @author qq940
 * @date 2018/6/3
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int len = 0;
        for (int i = s.length() - 1; i > 0; i --, len ++) {
            if (s.charAt(i) == ' '){
                return len;
            }
        }
        return s.length();
    }
}
