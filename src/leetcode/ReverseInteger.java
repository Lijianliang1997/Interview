package leetcode;

/**
 * Created by qq940 on 2018/5/9.
 */
public class ReverseInteger {
    public int reverse (int x) {
        long res = 0;
        int tmp =Math.abs(x);
        while (tmp > 0) {
            res = res * 10 + tmp % 10;
            if ((res >Integer.MAX_VALUE )) {
                return 0;
            }
            tmp /= 10;
        }

        return (int)(x>=0?res:-res);
    }
}
