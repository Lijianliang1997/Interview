package bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/10.
 */
public class FindNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i ++) {
            int num = in.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= n; i ++) {
            if (!map.containsKey(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
