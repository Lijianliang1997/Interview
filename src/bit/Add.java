package bit;

/**
 * @author lijianliang
 * @date 2018/7/24.
 */
public class Add {
    /**
     * 两个数异或:相当于每一位相加,而不考虑仅为
     * 两个数相与,并左移一位: 相当于求进位
     * 将上述两步的结果相加
     * @param num1
     * @param num2
     * @return
     */
    public int Add(int num1,int num2) {
        while (num2 != 0) {
            int sum = num1 ^ num2;
            int carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
