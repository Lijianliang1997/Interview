package qunar;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by qq940 on 2018/4/2.
 */
public class WordDictionary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String[] dictionary = in.nextLine().split(" ");
        boolean[] used = new boolean[dictionary.length];
        String tmpWord = reverse(word);
        System.out.println(wordDic(word,tmpWord, dictionary, 0, used) + 1);
    }
    public static int diff (String word1, String word2) {
        if (word1.length() != word2.length()) {
            return -1;
        }
        int len = word1.length();
        int diff = 0;
        for (int i = 0; i < len; i ++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diff ++;
            }
        }
        return diff;
    }

    public static int wordDic (String word,String tmpWord, String[] dictionary, int num, boolean[] used) {;
        int count = 0;
        int min = Integer.MAX_VALUE;
        if (diff(tmpWord, word) == 1) {
            return num;
        }
        for (int i = 0; i < dictionary.length; i ++) {
            if (diff(tmpWord, dictionary[i]) == 1 && !used[i]) {
                used[i] = true;
                count = wordDic(word, dictionary[i], dictionary, num + 1, used);
                used[i] = false;
                min = Math.min(count, min);
            }
        }
        return min;
    }
    public static String reverse (String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = len - 1; i >= 0; i --) {
            sb.append(s.charAt(i)+"");
        }
        String ret = sb.toString();
        return ret;
    }
}
