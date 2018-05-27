package NetEase;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by qq940 on 2018/3/26.
 */
public class toSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        Set<Double> set = new HashSet<>();
        for (int i = w; i <= x; i ++) {
            for (int j = y; j <= z; j ++) {
                double key = (i * 1.0)  / j;
                set.add(key);
            }
        }
        System.out.println(set.size());
    }
}
