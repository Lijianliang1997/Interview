package NetEase;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by qq940 on 2018/3/26.
 */
public class RememberWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] remStrs = new String[n];
        String[] sysStrs = new String[m];
        in.nextLine();
        remStrs = in.nextLine().split(" ");
        sysStrs = in.nextLine().split(" ");
        Set<String> sysSet = new HashSet<>();
        for (int i = 0; i < m; i ++) {
            sysSet.add(sysStrs[i]);
        }
        System.out.println(calScore(remStrs, sysSet));
    }

    public static int calScore (String[] remStrs, Set<String> sysSet) {
        Set<String> set = new HashSet<>();
        int score = 0;
        for (String str : remStrs) {
            if (!set.contains(str) && sysSet.contains(str)) {
                int len = str.length();
                score = score + len * len;
                set.add(str);
            }
        }
        return score;
    }
}
