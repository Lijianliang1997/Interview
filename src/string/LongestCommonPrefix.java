package string;

import java.util.Arrays;

/**
 * Created by qq940 on 2018/5/12.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        if (strs != null && strs.length > 0) {
            Arrays.sort(strs);
            char[] a = strs[0].toCharArray();
            char[] b = strs[strs.length - 1].toCharArray();
            for (int i = 0; i < a.length; i++) {
                if (b.length > i && b[i] == a[i]) {
                    prefix.append(b[i]);
                } else {
                    return prefix.toString();
                }
            }
        }
        return prefix.toString();
    }
}
