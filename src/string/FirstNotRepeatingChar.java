package string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijianliang
 * @date 2018/7/17.
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i ++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i ++) {
            int num = map.get(str.charAt(i));
            if (num == 1) {
                return i;
            }
        }
        return -1;
    }
}
