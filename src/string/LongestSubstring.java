package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by qq940 on 2018/4/8.
 */
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int leftBound = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            leftBound = Math.max(leftBound, (map.containsKey(c)? map.get(c) + 1: 0));
            max = Math.max(max, i - leftBound + 1);
            map.put(c, i);
        }
        return max;
    }
}
