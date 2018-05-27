package binarySearch;

/**
 * Created by qq940 on 2018/3/7.
 */
public class ArrangeCoins {
    public int arrangeCoins (int n) {
        int level = 1;
        while (n > 0) {
            n -= level;
            level ++;
        }
        return n == 0 ? level - 1 : level - 2;
    }
}
