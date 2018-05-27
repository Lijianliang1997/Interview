package NetEase;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/25.
 */
public class ToCompany {
    public static int toCompany (int n,int[] tx, int[] ty, int gx, int gy, int walkTime, int taxiTime) {
        int min = (Math.abs(gx) + Math.abs(gy)) * walkTime;
        int sum = 0;
        for (int i = 0; i < n; i ++) {
            sum = (Math.abs(tx[i]) + Math.abs(ty[i])) * walkTime + (Math.abs(tx[i] - gx) + (Math.abs(ty[i] - gy))) * taxiTime;
            min = Math.min(sum, min);
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tx = new int[n];
        for (int i = 0; i < n; i ++) {
            tx[i] = in.nextInt();
        }
        int[] ty = new int[n];
        for (int i = 0; i < n; i ++) {
            ty[i] = in.nextInt();
        }
        int gx, gy;
        gx = in.nextInt();
        gy = in.nextInt();
        int walkTime = in.nextInt();
        int taxiTime = in.nextInt();
        System.out.println(toCompany(n, tx, ty, gx, gy, walkTime, taxiTime));
    }
}
