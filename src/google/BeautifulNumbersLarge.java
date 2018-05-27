package google;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/2/26.
 */
public class BeautifulNumbersLarge {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = in.nextInt();
        for (int i = 1; i <=  cases; i ++) {
            long n = in.nextInt();
            System.out.println("Case #" +i + ": " + beautiful(n));
        }
    }

    private static long beautiful(long n) {
        for (int bits = 64; bits >= 2; bits --) {
            long radix = getRadix(n, bits);
            if (radix != -1) {
                return radix;
            }
        }
        throw new IllegalStateException("Should not reach here");
    }

    /**
     * Gets radix so that n is 111..111(bits 1 in total) int that radix
     * @param n
     * @param bits
     * @return the radix. -1 i there'sd no such radix
     */
    private static long getRadix(long n, int bits) {
        long minRadix = 2;
        long maxRadix = n;
        while (minRadix < maxRadix) {
            long midRadix = minRadix + (maxRadix - maxRadix) / 2;
            long t = convert(midRadix , bits);
            if (t == n) {
                return midRadix;
            } else if (t < n) {
                minRadix = midRadix + 1;
            } else {
                maxRadix = midRadix;
            }
        }
        return -1;
    }

    /**
     * Returns the values of 111...11(bits 1 in total) in radix
     * @param midRadix
     * @param bits
     * @return
     */
    private static long convert(long midRadix, int bits) {
        long component = 1;
        long sum = 0;
        for (int i = 0; i < bits; i ++) {
            if (Long.MAX_VALUE - sum < component) {
                sum =  Long.MAX_VALUE;
            } else {
                sum += component;
            }
            if (Long.MAX_VALUE / component < midRadix) {
                component = Long.MAX_VALUE;
            } else {
                component *= midRadix;
            }
        }
        return sum;
    }

}
