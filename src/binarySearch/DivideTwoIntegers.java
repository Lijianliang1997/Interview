package binarySearch;

/** leetcode 29
 * @author lijianliang
 * @date 2018/7/7.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int res = 0;
        //判断最终结果的正负性
        boolean isPositive = true;
        if((dividend<0&&divisor>0) || (dividend>0&&divisor<0)){
            isPositive = false;
        }
        //判断结束后全部当做正数进行操作
        //使用long解决数值溢出情况
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        if(ldivisor==0) {
            return Integer.MAX_VALUE;
        }
        if(ldividend==0 || ldividend<ldivisor) {
            return 0;
        }
        long result = divide(ldividend, ldivisor);
        if(result>Integer.MAX_VALUE){
            return isPositive? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return (int)(isPositive? result : -result);
    }

    public long divide (long dividend, long divisor) {
        if (dividend < divisor) {
            return 0;
        }
        long  sum = divisor;
        long res = 1;
        while (dividend >= (sum +  sum)) {
            sum += sum;
            res += res;
        }
        return res + divide(dividend - sum, divisor);
    }
}
