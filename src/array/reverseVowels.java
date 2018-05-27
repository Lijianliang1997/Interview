package array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by qq940 on 2018/3/11.
 */
public class reverseVowels {
    private HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

    public String reverseVowels (String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] result = new char[s.length()];
        while (l <= r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if (!vowels.contains(cl)) {
                result[l] = cl;
                l ++;
            } else if (!vowels.contains(cr)) {
                result[r] = cr;
                r --;
            } else {
                result[l] = cr;
                result[r] = cl;
                l ++;
                r --;
            }
        }
        return new String(result);
    }
}
