package NetEase;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/2/6.
 */
public class Filed {
    public static int minVal;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (n < 4 || m < 4) {
            return;
        }
        Integer[][] arr = new Integer[n][m];
        int[] minPoint = new int[2];
        for (int i = 0; i < n; i ++) {
            String temp = in.next();
            String[] tempArr = temp.split("");
            for (int j = 0; j < m; j ++) {
                arr[i][j] = Integer.valueOf(tempArr[j]);
            }
        }
        getMinPoint(arr,m,n,minPoint);//获取矩阵中最小值位置
        minVal=arr [minPoint[0]][minPoint[1]];//初始化牛牛获得的最小价值
        System.out.println("所有分法：");
        getMaxVal(arr,m,n,minPoint);//分田过程
        System.out.println("最终牛牛获得的价值："+minVal);//输出牛牛获得的价值
    }


    private static void getMaxVal(Integer[][] arr, int n, int m, int[] minPoint) {
        Integer[][] oldArr = new Integer[n][m];
        oldArr = arr;
        int n0 = minPoint[0];
        int m0 = minPoint[1];
        if (n == m && n == 4) {
            for (int i = 0; i < 4; i++) {
                System.out.println(Arrays.toString(arr[i]));
            }
            System.out.println();
            return;
        }
        if (n0 > 0 && n > 4) { //向上合并
            arr = mergeMatrix(arr, n, m, n0 - 1, m, minPoint, 1);
            getMaxVal(arr, arr.length, arr[0].length, minPoint);
        }
        arr = oldArr;
        if (n0 < n  && n > 4) { //向下合并
            arr = mergeMatrix(arr, n, m, n0 , m, minPoint, 1);
            getMaxVal(arr, arr.length, arr[0].length, minPoint);
        }
        arr = oldArr;
        if (m0 > 0 && m > 4) { //向左合并
            arr = mergeMatrix(arr, n, m, n, m0 - 1, minPoint, -1);
            getMaxVal(arr, arr.length, arr[0].length, minPoint);
        }
        arr = oldArr;
        if (n0 > 0 && n > 4) { //向下合并
            arr = mergeMatrix(arr, n, m, n, m0 - 1, minPoint, -1);
            getMaxVal(arr, arr.length, arr[0].length, minPoint);
        }
        arr = oldArr;
    }

    private static Integer[][] mergeMatrix(Integer[][] arr, int n, int m, int mergeN, int mergeM, int[] minPoint, int flag) {
        Integer[][] temp = null;
        if (flag == 1) { // 向上合并或者向下
            temp = new Integer[n - 1][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i < mergeN) {
                        temp[i][j] = arr[i][j];
                    } else if (i == mergeN) {
                        temp[i][j] = arr[i][j] + arr[i + 1][j];
                    } else {
                        temp[i - 1][j] = arr[i][j];
                    }
                }
                if (i == mergeN) {
                    i++;
                }
            }

        } else if (flag == -1) {//向左合并 或 向右合并
            temp = new Integer[n][m - 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    if (j < mergeM) {
                        temp[i][j] = arr[i][j];
                    } else if (j == mergeM) {
                        temp[i][j] = arr[i][j] + arr[i][j + 1];
                        j++;
                    } else {
                        temp[i][j - 1] = arr[i][j];
                    }
                }
            }
        }
        //合并后的矩阵求其中最小的位置
        getMinPoint(temp,temp.length-1,temp[0].length-1,minPoint);
        return temp;
    }
    // 获取矩阵最小位置
    private static void getMinPoint(Integer[][] arr, int n, int m, int[] minPoint) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minPoint[0] = i;
                    minPoint[1] = j;
                }
            }
        }
        if (minVal < min) {
            minVal = min;
        }
    }
}
