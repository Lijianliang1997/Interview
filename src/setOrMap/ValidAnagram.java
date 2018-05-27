package setOrMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qq940 on 2018/3/25.
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.equals(t)) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        for (char c : sMap.keySet()) {
            if (!tMap.containsKey(c) || !sMap.get(c).equals(tMap.get(c)) ) {
                return false;
            } else {
                continue;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ba", "ab"));
    }
}
