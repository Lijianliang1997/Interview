package bit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/5/14.
 */
public class CountingBit {
    public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        for (int i = 0; i <= num; i ++) {
            arr[i] = bit(i);
        }
        return arr;
    }

    public int bit (int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count ++;
        }
        return count;
    }
}
