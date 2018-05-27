package array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by qq940 on 2018/1/20.
 */
public class PrintMatrix {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        if(matrix.length==0) return result;
        int n = matrix.length,m = matrix[0].length;
        if(m==0) return result;
        int layers = (Math.min(n,m)-1)/2+1;//这个是层数
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++) result.add(matrix[i][k]);//左至右
            for(int j=i+1;j<n-i;j++) result.add(matrix[j][m-i-1]);//右上至右下
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(matrix[n-i-1][k]);//右至左
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(matrix[j][i]);//左下至左上
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8}};
        ArrayList<Integer> matrixList =  printMatrix(matrix);
        System.out.println(Arrays.toString(matrixList.toArray()));
    }
}
