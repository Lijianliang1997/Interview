package credit;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/5/7.
 */
public class RGB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split("");
        int r=0; int g=0; int b=0;
        for (int i = 0; i < str.length(); i ++) {
            char c = str.charAt(i);
            if (c == 'R') {
                r ++;
            } else if (c == 'G') {
                g ++;
            } else {
                b ++;
            }
        }
        Arrays.fill(s,0,r,"R");
        Arrays.fill(s,r,r+g,"G");
        Arrays.fill(s, r + g, r + g + b, "B");
        StringBuilder sb = new StringBuilder();
        for (String c : s) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
