package NetEase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/26.
 */
public class Operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(operation(str));
    }

    public static int operation (String str) {
        if (str == null) {
            return 0;
        }
        int n = str.length();
        int ans = str.charAt(0) - '0';
        for (int i = 1; i < n; i ++) {
            char temp = str.charAt(i);
            switch (temp) {
                case '+' : ans += str.charAt(i + 1) - '0'; break;
                case '-' : ans -= str.charAt(i + 1) - '0'; break;
                case '*' : ans *= str.charAt(i + 1) - '0'; break;
            }
        }
        return ans;
    }
}
