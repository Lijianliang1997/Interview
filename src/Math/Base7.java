package Math;

/**
 * Created by qq940 on 2018/4/6.
 */
public class Base7 {
    public String convertToBase7 (int num) {
        if (num < 0) {
            return '-' + convertToBase7(-num);
        }
        if (num < 7) {
            return num + "";
        }
        return convertToBase7(num / 7) + num % 7;
    }

}
