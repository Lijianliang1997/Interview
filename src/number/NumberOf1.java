package number;

/**
 * Created by qq940 on 2018/1/3.
 */
public class NumberOf1 {
    /**

     *  分析一下代码： 这段小小的代码，很是巧妙。
     *  如果一个整数不为0，那么这个整数至少有一位是1。
     *  如果我们把这个整数减1，那么原来处在整数最右边的1就会变为0，原来在1后面的所有的0都会变成1(如果最右边的1后面还有0的话)。其余所有位将不会受到影响。
     * @param n
     * @return
     */
    public static int NumberOf1(int n) {
        int sum = 0;
        while (n != 0) {
            ++sum;
            n = (n - 1) & n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(NumberOf1(n));
    }
}
