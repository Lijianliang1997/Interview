package lianjia;

import java.util.*;

/**
 * Created by qq940 on 2018/4/8.
 */
public class Light {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int[][] btns = new int[k][];
        Map<Integer, Boolean> used = new HashMap<>();
        for (int i = 0 ; i < k; i ++) {
            int n = in.nextInt();
            int[] btn = new int[n + 1];
            btn[0] = n;
            for (int j = 1; j <= n; j ++) {
                int num = in.nextInt();
                btn[j] = num;
                used.put(num, false);
            }
            btns[i] = btn;
        }
        Arrays.sort(btns, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        System.out.println(dfs(0, used, btns));
    }

    public static int dfs (int idx, Map<Integer, Boolean> used, int[][] btns) {
        if (idx >= btns.length) {
            return 0;
        }
        int[] btn = btns[idx];
        int len = btn.length;
        int max = 0;
        for (int i = 1; i < len; i ++) {
            int num = btn[i];
            if (!used.get(num)) {
                used.put(num, true);
                max = 1 + dfs(idx + 1, used, btns);
                used.put(num, false);
            }  else {
                max = dfs(idx + 1, used, btns);
            }
        }
        return max;
    }
}
