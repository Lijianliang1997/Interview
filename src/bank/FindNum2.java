package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/10.
 */
public class FindNum2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 6; i ++) {
            list.add(i);
        }
        if (n <= 6) {
            System.out.println(list.get(n - 1));
            return;
        }
        for (int i = 7; i <= n; i ++) {
            int count = 0;
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            for (int num : list) {
                if (count == 3) {
                    break;
                }
                if (num * 2 > list.get(list.size() - 1) && num1 == 0) {
                    num1 = 2 * num;;
                    count ++;
                    continue;
                }
                if (num * 3 > list.get(list.size() - 1) && num2 == 0) {
                    num2 = 3 * num;;
                    count ++;
                    continue;
                }
                if (num * 5 > list.get(list.size() - 1) && num3 == 0) {
                    num3 = 5 * num;;
                    count ++;
                    continue;
                }
            }
            if (count == 3) {
                int min = Math.min(num1, Math.min(num2, num3));
                list.add(min);
            }
        }
        System.out.println(list.get(n - 1));
    }
}
