package jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/9.
 */
public class Divide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] nums = new int[t];
        for (int i = 0; i < t; i ++) {
            nums[i] = in.nextInt();
        }
        for (int num : nums) {
            List<Integer> list = divide(num);
            if (list.size() == 0) {
                System.out.println("No");
            } else {
                StringBuilder sb = new StringBuilder();
                for (Integer res : list) {
                    sb.append(res + " ");
                }
                sb.deleteCharAt(sb.length() - 1);
                System.out.println(sb.toString());
            }
        }
    }

    public static List<Integer> divide (int num) {
        List<Integer> ret1 = new ArrayList<>();
        List<Integer> ret2 = new ArrayList<>();
        int sqrt = (int)Math.sqrt(num);
        int odd = 0;
        int even = 0;
        if (sqrt % 2 == 0) {
            odd = sqrt - 1;
            even = sqrt;
        } else {
            even = sqrt + 1;
            odd = sqrt;
        }
        int i = odd;
        int j = even;
        while (j > 0 && i < num) {
            if (i * j > num) {
                j -= 2;
            } else if (i * j < num) {
                i += 2;
            } else {
                ret2.add(i);
                ret2.add(j);
                j -= 2;
            }
        }
        i = odd;
        j = even;
        while (i > 0 && j < num) {
            if (i * j > num) {
                i -= 2;
            } else if (i * j < num) {
                j += 2;
            } else {
                ret1.add(i);
                ret1.add(j);
                break;
            }
        }
        if (ret1.size() == 0 && ret2.size() == 0) {
            return ret1;
        } else if (ret1.size() == 0 && ret2.size() != 0) {
            return ret2;
        } else if (ret2.size() == 0 && ret1.size() != 0) {
            return ret1;
        } else if (ret1.get(1) < ret2.get(1)) {
            return ret1;
        } else {
            return ret2;
        }
    }
}
