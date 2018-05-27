package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qq940 on 2018/3/11.
 */
public class PartitionLabels {
    public static List<Integer> partitionLabels (String S) {
        List<Integer> ret = new ArrayList<>();
        int[] lastIndexes = new int[26];
        for (int i = 0; i < S.length(); i ++ ) {
            lastIndexes[S.charAt(i) - 'a'] = i;
        }
        int startIndex = 0;
        while (startIndex < S.length()) {
            int endIndex = startIndex;
            for (int i = startIndex; i < S.length() && i <= endIndex; i++) {
                int lastIndex = lastIndexes[S.charAt(i) - 'a'];
                if (lastIndex == i) {
                    continue;
                }
                if (lastIndex > endIndex) {
                    endIndex = lastIndex;
                }
            }
            ret.add(endIndex - startIndex + 1);
            startIndex = endIndex + 1;
        }
        return ret;
    }

    public static  List<Integer> partitionLabels2 (String s) {
        List<Integer> ret = new ArrayList<>();
        int[] lastIndexes = new int[26];
        for (int i = 0; i < s.length(); i ++) {
            lastIndexes[s.charAt(i) - 'a'] = i;
        }
        int startIndex = 0;
        while  (startIndex < s.length()) {
            int endIndex = startIndex;
            for (int i = startIndex; i < s.length() && i <= endIndex; i ++) {
                int lastIndex = lastIndexes[s.charAt(i) - 'a'];
                if (lastIndex == i) {
                    continue;
                }
                if (lastIndex > endIndex) {
                    endIndex = lastIndex;
                }
            }
            ret.add(endIndex - startIndex + 1);
            startIndex = endIndex + 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Integer> res =  partitionLabels("eccbbbbdec");
        System.out.println(Arrays.toString(res.toArray()));
    }
}
