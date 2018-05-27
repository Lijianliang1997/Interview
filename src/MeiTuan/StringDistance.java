package MeiTuan;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/22.
 */
public class StringDistance {
    public static int stringDistance (String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int n = len1 - len2 + 1;
        int sum = 0;
        String temp;
        for (int i = 0 ; i < n; i ++){
            temp = s1.substring(i, i + len2);
            sum += distance(temp, s2);
        }
        return sum;
    }

    public static int distance (String s1, String s2) {
        int len = s1.length();
        int sum = 0;
        for (int i = 0; i < len; i ++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                sum ++;
            } else {
                continue;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(stringDistance(s1, s2));
    }
}
