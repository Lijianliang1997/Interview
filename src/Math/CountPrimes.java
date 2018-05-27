package Math;

/**
 * Created by qq940 on 2018/4/6.
 */
public class CountPrimes {
    public int countPrimes (int n) {
        boolean[] notPrimes = new boolean[n + 1];
        int cnt = 0;
        for (int i = 2; i < n; i ++) {
            if (notPrimes[i]) {
                continue;
            }
            cnt ++;
            for (long j = (long) i * i; j < n; j += i) {
                notPrimes[(int) j] = true;
            }
        }
        return cnt;
    }
}
