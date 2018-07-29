package string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lijianliang
 * @date 2018/7/29.
 */
public class FirstAppearOnce {
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for (Map.Entry<Character,Integer> set : map.entrySet()) {
            if (set.getValue() == 1) {
                return set.getKey();
            }
        }
        return '#';
    }
}
