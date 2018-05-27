package bank;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/29.
 */
public class findSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String tmp = "";
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        if (len == 1) {
            return;
        }
        if (len == 2) {
            if (str.charAt(0) == str.charAt(1)) {
                System.out.println(str.charAt(0));
                return;
            }
        }
        for (int i = len - 2; i > 0; i --) {
            sb = null;
            tmp = str.substring(0,i + 1);
            int num = len / (i + 1);
            for (int j = 1; j <= num; j ++) {
                sb.append(tmp);
            }
            String tmpStr = sb.toString();
            if (tmpStr.equals(str)) {
                System.out.println(tmp);
                return;
            }
        }
    }
}
