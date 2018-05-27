package webank;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/16.
 */
public class LimitArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int count = 0;
            boolean flag = false;
            List<Integer> list1 = new ArrayList<>();
            if (n <= 1) {
                System.out.println(count);
                return;
            }
            for (int i = 2; i <= n ;i ++) {
                flag = false;
                for (int j = 2; j< i; j ++) {
                    if (i % j == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    list1.add(i);
                }
            }
            List<Integer> list2 = new ArrayList<>();
            int len = list1.size();
            for (int i = 0; i < len; i ++) {
                int e = list1.get(i);
                int tmp = e;
                for (int j = 2; tmp * e <= n; j ++) {
                    tmp *= e;
                    list2.add(e);
                }
            }
            int ret = len + list2.size();
            System.out.println(ret);
        }
    }
}
