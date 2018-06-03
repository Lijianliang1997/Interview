package string;

/**
 * Created by qq940 on 2018/4/7.
 */
public class KMP {
    public  int kmp (String str, String sub) {
        if(str == null || sub == null || str.length() == 0 || sub.length() == 0){
            throw new IllegalArgumentException("str或者sub不能为空");
        }
        int i =0, j =0;
        int[] next = next(sub);
        while (j < next.length && i < str.length()) {
            if (j == -1 || str.charAt(i) == sub.charAt(i)) {
                i ++;
                j ++;
            } else {
                j = next[j];
            }
        }
        if ( j < next.length){
            return -1;
        } else {
            return i - sub.length();
        }
    }

    public int[] next (String sub) {
        int [] next = new int[sub.length()];
        int len = 0;
        int i ,j;
        i = 0;
        j = next[0] = 1;
        while (i < len - 1) {
            while (j != -1 && sub.charAt(i) != sub.charAt(j)) {
                j = next[j];
            }
            next[++i] = ++j;
        }
        return next;
    }

    public static void main(String[] args) {
        KMP kmp = new KMP();
        System.out.println(kmp.kmp("hello", "ll"));
    }
}
