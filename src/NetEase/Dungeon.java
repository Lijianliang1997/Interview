package NetEase;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by qq940 on 2018/2/4.
 */
public class Dungeon {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            char[][] points = new char[n][m];
            int[][] target = new int[n][m];
            for(int i = 0; i < n; i ++){
                String str = cin.next();
                points[i] = str.toCharArray();
            }
            int x = cin.nextInt();
            int y = cin.nextInt();
            int k = cin.nextInt();
            int[] stepX = new int[k];
            int[] stepY = new int[k];
            for(int i=0;i<k;i++){
                stepX[i] = cin.nextInt();
                stepY[i] = cin.nextInt();
            }
            Queue<Integer> xQueue = new LinkedList<Integer>();
            Queue<Integer> yQueue = new LinkedList<Integer>();
            xQueue.add(x);
            yQueue.add(y);
            target[x][y] = 1; // 起始点标记，1表示已访问
            while (!xQueue.isEmpty() && !yQueue.isEmpty()) {
                x = xQueue.remove();
                y = yQueue.remove();
                for (int i = 0; i < k; i ++) {
                    int newX = x + stepX[i];
                    int newY = y + stepY[i];
                    if (newX < n && newX >= 0 && newY < m && newY >= 0) { //防止越界
                        if (target[newX][newY] == 0) {
                            if (points[newX][newY] == '.') {
                                target[newX][newY] = target[x][y] + 1;
                                xQueue.add(newX);
                                yQueue.add(newY);
                            } else {
                                target[newX][newY] = -1;
                            }
                        }
                    }
                }
            }
            int max = 0;
            int getRoad = 1;
            for (int i = 0; i < n; i ++) {
                for (int j = 0; j < m; j ++) {
                    if (points[i][j] == '.' && target[i][j] == 0) {
                        getRoad = 0;
                    }
                    max = Math.max(max, target[i][j]);
                }
            }
            if (getRoad == 0) {
                System.out.println(-1);
            } else {
                System.out.println(max - 1);
            }
        }
    }
}
