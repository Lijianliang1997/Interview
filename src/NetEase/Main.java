package NetEase;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Calendar;
        import java.util.List;
        import java.util.Scanner;
        import java.util.Vector;
         
        import javax.xml.crypto.Data;
         
        import org.omg.CORBA.PRIVATE_MEMBER;
        import org.omg.CORBA.PUBLIC_MEMBER;
         
public class Main{
 
            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
         
        int x1 = 0;       //代表横方向3刀
        int x2 = 0;
        int x3 = 0;
         
        int y1 = 0;       //代表纵方向3刀
        int y2 = 0;
        int y3 = 0;
         
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [] [] arr = new int[n][m];
             
            for(int i = 0;i < n;i++){
                String string = scanner.next();
                for(int j = 0;j < m;j++){
                    arr[i][j] = string.charAt(j) - '0';
                }
            }
             
            int [][] sum = new int[n+1][m+1];
            //sum[i][j]表示左上顶点arr[0][0]到右下顶点arr[i-1][j-1]的矩阵元素的和
            //sum[1][1]表示arr[0][0]
            for(int i = 1;i < n+1;i++){
                for(int j = 1;j < m+1;j++){
                    sum[i][j] = sum[i-1][j] + sum[i][j-1] - 
                            sum[i-1][j-1] + arr[i-1][j-1];  //该公式已验证，正确
                }
            }
            int left = 0;
            int right = sum[n][m];
            int res = 0;
             
            while(left <= right){
                int mid = (left + right)/2;
                if (judge(mid,n,m,sum)) {
                    left = mid + 1;
                    res = mid;
                }
                else {
                    right = mid -1;
                }
            }
            System.out.println(res);
        }
        scanner.close();
         
         
         
    }
     
             
            //计算arr矩阵中左上定点(i,j)到右下顶点(x-1,y-1)确定的田地的价值和
            public static int cal(int x,int y,int i,int j,int[][] sum){
        return sum[x][y] - sum[x][j] - sum[i][y] + sum[i][j];
    }
     
             
            //判断x是否<=田地中最小一块的值
            public static boolean judge(int x,int n,int m,int[][] sum){
        for(int i = 1;i <= m-3;i++){
            for(int j = i+1;j <= m-2;j++){
                for(int k = j+1;k <= m-1;k++){
                    int last = 0;
                    int cnt = 0;
                    for(int r = 1;r <= n;r++){
                        int s1 = cal(r,i,last,0,sum);
                        int s2 = cal(r,j,last,i,sum);
                        int s3 = cal(r,k,last,j,sum);
                        int s4 = cal(r,m,last,k,sum);
                        //当前横切一刀条件满足
                        if(s1 >= x && s2 >= x && s3 >= x && s4 >= x){
                            last = r;
                            cnt++;
                        }
                    }
                    //表明x小于等于16块田地中的最小值，返回true
                    if(cnt >= 4){
                        return true;
                    }
                }
            }
        }
        return false;
    }
 
}