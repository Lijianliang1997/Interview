package string;

/**
 * @author lijianliang
 * @date 2018/7/31.
 */
public class KMP {

    public int kmp (String str, String sub) {
        if(str == null || sub == null || str.length() == 0 || sub.length() == 0){
            throw new IllegalArgumentException("str或者sub不能为空");
        }
        int i = 0;
        int j = 0;
        int[] next = next(sub);
        while (j < next.length && i < str.length()) {
            if (str.charAt(i) == sub.charAt(j)) {
                i ++;
                j ++;
            } else if (next[j] == -1) {
                i ++;
            }
            else {
                j = next[j];
            }
        }
        if (j < next.length) {
            return -1;
        } else {
            return i - sub.length();
        }
    }
    public int[] next (String sub) {
        if (sub.length() == 1) {
            return new int[] {-1};
        }
        int len = sub.length();
        int[] next = new int[len];
        next[0] = -1;
        next[1] = 0;
        int i =2, j = 0;
        while (i < len ) {
            if (sub.charAt(i - 1) == sub.charAt(j)) {
                next[i ++] = ++ j;
            } else if (j > 0) {
                j = next[j];
            } else {
                next[i ++] = 0;
            }
        }
        return next;
    }

    public static void main(String[] args) {
        KMP kmp = new KMP();
        String str = "mississippi";
        String sub = "issip";
        System.out.println(kmp.kmp(str,sub));
    }
}
