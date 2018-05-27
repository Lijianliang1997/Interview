package bit;

import java.math.BigDecimal;

/**
 * Created by qq940 on 2018/4/15.
 */
public class ReverseBit {
    public int reverseBit (int n) {
        String s = "";
        for (int i = 0; i < 32; i ++) {
            int num = n % 2;
            s += num;
            n = n >>> 1;
        }
        int ret = Integer.parseInt(s, 2);
        return ret;
    }
    public int reverseBit2 (int n) {
        int ret = 0;
        for (int i = 0; i < 32; i ++) {
            ret <<= 1;
            ret |= (n & 1);
            n >>>= 1;
        }
        return ret;
    }

    public static void main(String[] args) {
        ReverseBit reverseBit = new ReverseBit();
        System.out.println(reverseBit.reverseBit( 1 ));
    }
}
