package number;

/**
 * Created by qq940 on 2018/1/3.
 */
public class Power {
    public static double power(double base, int exponent) {
        int n = 0;
        double result = 1;
        if (exponent > 0) { // 考虑指数是否为负数
            n = exponent;
        } else if (exponent < 0) {
            if (base == 0) { // 0 不能当分母
                return 0;
            }
            n = -exponent;
        } else {
            return 1;
        }
        while (n > 0) {
            result *= base;
            n = n - 1;
        }
        return exponent >= 0 ? result : 1 / result;
    }

    public static void main(String[] args) {
        System.out.println(power(2.0, 3));
    }
}
