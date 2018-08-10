package dp;

import java.util.HashMap;

/**
 * @author lijianliang
 * @date 2018/8/10.
 */
public class CoinsWay {
    public static int coins1(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        return process1(arr, 0 , aim);
    }

    // int[] arr: 不变的变量,钱的数组
    // index: 可以任意使用index及其之后的钱
    // aim : 目标钱数
    // 返回值: 方法数
    private static int process1(int[] arr, int index, int aim) {
        int res = 0;
        if (index == arr.length) {
            res = aim == 0 ? 1 : 0;
        } else {
            for (int i = 0; arr[index] * i <= aim; i ++) {
                res += process1(arr, index +  1, aim - arr[index] * i);
            }
        }
        return res;
    }

    // key: index_aim
    // value:返回值
    public static HashMap<String, Integer> map = new HashMap<>();

    public static int process_map(int[] arr, int index, int aim) {
        int res = 0;
        if (index == arr.length) {
            res = aim == 0 ? 1 : 0;
        } else {
            for (int i = 0; arr[index] * i <= aim; i ++) {
                int nextAim = aim - arr[index] * i;
                String key = String.valueOf(index + 1) + "_" +String.valueOf(nextAim);
                if (map.containsKey(key)) {
                    res += map.get(key);
                } else {
                    res += process_map(arr, index + 1, aim - arr[index] * i);
                }
            }
        }
        map.put(String.valueOf(index) + "_" + String.valueOf(aim), res);
        return res;
    }

    public static int process3(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        int[][] dp = new int[arr.length][aim + 1];
        for (int i = 0; i < arr.length; i ++) {
            dp[i][0] = 1;
        }
        for (int j = 1; arr[0] * j <= aim; j ++) {
            dp[0][arr[0] * j] = 1;
        }
        int num = 1;
        for (int i = 1; i < arr.length; i ++) {
            for (int j = 1; j < aim; j ++) {
                num = 0;
                for (int k = 0; j - arr[i] * k > 0 ; k ++) {
                    num += dp[i - 1][j - arr[i] * k];
                }
                dp[i][j] = num;
            }
        }
        return dp[arr.length - 1][aim];
    }
    public static int process4(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        int[][] dp = new int[arr.length][aim + 1];
        for (int i = 0; i < arr.length; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; arr[0] * j <= aim; j++) {
            dp[0][arr[0] * j] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= aim; j++) {
                dp[i][j] = dp[i - 1][j];
                dp[i][j] += j - arr[i] >= 0 ? dp[i][j - arr[i]] : 0;
            }
        }
        return dp[arr.length - 1][aim];
    }


}
