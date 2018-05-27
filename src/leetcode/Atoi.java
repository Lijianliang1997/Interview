package leetcode;

/**
 * Created by qq940 on 2018/5/9.
 */
public class Atoi {
    public int myAtoi (String str) {
        str = str.trim();
        if (str == null || str.length() == 0) {
            return 0;
        }
        boolean positive = true;
        int i = 0;
        if(str.charAt(0) == '+') {
            i ++;
        } else if (str.charAt(0) == '-') {
            positive = false;
            i ++;
        }

        double tmp = 0;
        for (;i < str.length(); i ++) {
            int digit = str.charAt(i) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            if (positive) {
                tmp = 10 * tmp + digit;
                if (tmp > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            } else {
                tmp = 10 *tmp - digit;
                if (tmp <Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        int ret = (int) tmp;
        return ret;
    }

    public static void main(String[] args) {
        Atoi atoi = new Atoi();
        System.out.println(atoi.myAtoi(" "));
    }
}
