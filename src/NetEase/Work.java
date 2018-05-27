package NetEase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/26.
 */
public class Work {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n ; i ++) {
            strings[i] = in.next();
        }
        System.out.println(dfs(strings, 0, new HashSet<>()));
    }

    public static int dfs (String[] strs, int index, HashSet<Integer> set) {
        int count = 0;
        if (index >= strs.length) {
            return 1;
        }
        String str = strs[index];
        for (int i = 0; i < str.length(); i ++) {
            int work = str.charAt(i) - '0';
            if (!set.contains(work)) {
                set.add(work);
                 count += dfs(strs, index + 1, set);
                set.remove(work);
            }
        }
        return count;
    }
}
