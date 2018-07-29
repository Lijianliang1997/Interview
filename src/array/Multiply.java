package array;

import java.util.ArrayList;

/**
 * 剑指offer-----构建乘积数组
 * 先用一个数组存储左边的便利结果,然后在反过来遍历数组,将两个结果相乘
 * @author lijianliang
 * @date 2018/7/29.
 */
public class Multiply {
    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) {
            return A;
        }
        int tmp = 1;
        int[] ret = new int[A.length];
        for (int i = 0; i < A.length; i ++) {
            ret[i] = tmp;
            tmp *= A[i];
        }
        tmp = 1;
        for (int i = A.length - 1; i >= 0; i --) {
            ret[i] *= tmp;
            tmp *= A[i];
        }
        return ret;
    }
}
