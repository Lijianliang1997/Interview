/**
 * Created by qq940 on 2018/1/31.
 */
public class Test {
    public static void main(String[] args) {
        test5();
    }
    public void test1() {
        int a=1, x=2;
        a=x>1?5*x:(x=7);
        System.out.println("a = " + a + " x = " + x);
    }
    public static int math(int x) {
        x = x & (x - 1);
        return x;
    }
    public static void test2() {
        int arr[][] = {{1,2,3},{4,5,6,7}, {9}};
        boolean found = false;
        ok :
        for(int i=0;i<arr.length ;i++)	{
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]  == 5) {
                    break ok;
                } else {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    public static void test3() {
        short s1 = 1;
        s1 = (short)(s1 + s1);
    }
    public static void test4() {
        long x = Long.MAX_VALUE;
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int sum = a + b;
        System.out.println("a=" + a + ",b=" + b + ",sum="+sum);
    }
    public static void test5() {
        int x =1;
        System.out.println( x==1 ? true : false);
    }
}
