package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by qq940 on 2018/4/4.
 */
public class LongestWord {
    public String findLongestWord (String s, List<String> d) {
        String ret = "";
        for (String str : d) {
            for (int i = 0, j = 0; i < s.length() && j < str.length(); i ++) {
                if (s.charAt(i) == str.charAt(j)) {
                    j ++;
                }
                if (j == str.length()) {
                    if (ret.length() < str.length() || (ret.length() == str.length() && ret.compareTo(str) > 0)) {
                        ret = str;
                    }
                }
            }
        }
        return ret;
    }
}
