package array;

import java.util.Collections;
import java.util.Random;

/**
 * 随机洗牌算法
 * @author qq940
 * @date 2018/6/8
 */
public class Shuffle {
    public int[] shuffle (int[] arr) {
        Random random = new Random();
        for (int i = arr.length; i > 1; i --) {
            swap(arr, i - 1 , random.nextInt(i - 1));
        }
        return arr;
    }

    private void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = arr[i];
    }
}
