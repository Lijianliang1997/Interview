package webank;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/16.
 */
public class NumOfOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int num = b - c + 1;
            System.out.println(num);
//            StringBuilder sb = new StringBuilder("1");
//            for (int i = 1; i <= a - b; i ++) {
//                sb.append(0);
//            }
//            for (int i = 1; i < b - c; i ++) {
//                sb.append(1);
//            }
//            sb.append(1);
//            for (int i = 1; i <= c; i ++) {
//                sb.append(0);
//            }
//            String s = sb.toString();
//            System.out.println(numOfOne(s));
        }
    }

    public static int numOfOne (String s) {
        int n = s.length();
        int cnt = 0;
        for (int i = 0; i < n; i ++) {
            if (s.charAt(i) == '1') {
                cnt ++;
            }
        }
        return cnt;
    }
}
