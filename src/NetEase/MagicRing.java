package NetEase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/25.
 */
public class MagicRing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            ret.add(in.nextInt());
        }
        while (k > 0) {
            ret = magicRing(ret);
            k --;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : ret) {
            sb.append(num + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    public static List<Integer> magicRing (List<Integer> list) {
        List<Integer> ret = new ArrayList<>();
        int n = list.size();
        for (int i = 0; i < n - 1; i ++) {
            int temp = (list.get(i) + list.get(i + 1)) % 100;
            ret.add(temp);
        }
        int temp = (list.get(n - 1) + list.get(0)) % 100;
        ret.add(temp);
        return ret;
    }
}
