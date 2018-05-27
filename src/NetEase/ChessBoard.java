package NetEase;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/3/26.
 */
public class ChessBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] board = new String[n][n];
        for (int i = 0; i < n; i ++) {
                String s = in.next();
                board[i] = s.split("");
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (board[j][i].equals(board[j + 1][i])) {
                    sum ++;
                    max = Math.max(max, sum);
                } else {
                    sum = 1;
                }
            }
            sum = 1;
        }
        System.out.println(max);
    }
}
