package NetEase;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/25.
 */
public class AdjustQueue {
    public static int adjustQueue (String[] queue) {
        int n = queue.length;
        int l = 0; // 已经移动了几个
        int sum1 = 0;
        for (int i = 0; i < n;  i ++) {
            if (queue[i].equals("B")) {
                sum1 += i - l;
                l ++;
            }
        }
        int sum2 = 0;
        l = 0;
        for (int i = 0; i < n;  i ++) {
            if (queue[i].equals("G")) {
                sum2 += i - l;
                l ++;
            }
        }
        return Math.min(sum1, sum2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] queue = s.split("");
        System.out.println(adjustQueue(queue));
    }
}
