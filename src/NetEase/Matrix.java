package NetEase;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/27.
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i ++) {
            x1[i] = in.nextInt();
        }
        for (int i = 0; i < n; i ++) {
            y1[i] = in.nextInt();
        }
        for (int i = 0; i < n; i ++) {
            x2[i] = in.nextInt();
        }
        for (int i = 0; i < n; i ++) {
            y2[i] = in.nextInt();
        }
        System.out.println(numOfCover(x1,y1,x2,y2));
    }

    public static int numOfCover (int[]x1,int[]y1,int[]x2,int[]y2) {
        return 0;
    }
}
