package bit;

/**
 * @author lijianliang
 * @date 2018/7/22.
 */
public class FindNumberAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null || array.length <= 1) {
            num1[0] = num2[0] = 0 ;
            return;
        }
        int len = array.length, index = 0, sum = 0;
        /**
         * 循环过后 sum = num1 ^ num2
         */
        for (int i = 0; i < array.length; i ++) {
            sum ^= array[i];
        }
        /**
         * 因为sum是两个数字的异或, 同一位相同的时候为0,不同的时候为1,所以我们找到第一个不为0的地方
         */
        for (index = 0; index < 32; index ++) {
            if ((sum & (1 << index)) != 0) {
                break;
            }
        }
        for (int i = 0; i < len; i ++) {
            if ((array[i] & (1 << index)) != 0) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }
}
