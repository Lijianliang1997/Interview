package NetEase;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/2/7.
 */
public class Test {
    public static int minVal;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (n <= 4 || m <= 4) {
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
        System.out.println(arr.toString());
//        getMinPoint(arr,m,n,minPoint);//获取矩阵中最小值位置
//        minVal=arr [minPoint[0]][minPoint[1]];//初始化牛牛获得的最小价值
//        System.out.println("所有分法：");
//        getMaxVal(arr,m,n,minPoint);//分田过程
//        System.out.println("最终牛牛获得的价值："+minVal);//输出牛牛获得的价值
    }

}
