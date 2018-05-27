package lianjia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/8.
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(triangle(n));
    }

    public static int triangle (int n) {
        List<Integer> dp = new ArrayList<>();
        dp.add(1);
        dp.add(2);
        dp.add(3);
        while (dp.get(dp.size() - 1) + dp.get(dp.size() - 2) <= n) {
            dp.add(dp.get(dp.size() - 1) + dp.get(dp.size() - 2));
        }
        return n - dp.size();
    }
}
