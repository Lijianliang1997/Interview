package string;

/**
 * Created by qq940 on 2018/4/7.
 */
public class KMP {
    public  int kmp (String str, String sub) {
        if(str == null || sub == null || str.length() == 0 || sub.length() == 0){
            throw new IllegalArgumentException("str或者sub不能为空");
        }

        int j = 0;
        int[] n = next(sub);
        for (int i = 0; i < str.length(); i ++) {
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = n[j - 1];
            }
            if (str.charAt(i) == str.charAt(j)) {
                j ++;
            }

            if (sub.length() == j) {
                int index = i - j + 1;
                return index;
            }
        }
        return -1;
    }

    public int[] next (String sub) {
        int [] n = new int[sub.length()];
        int x = 0;
        for (int i = 0; i < sub.length(); i ++) {
            while (x > 0 && sub.charAt(i) != sub.charAt(x)) {
                x = n[x - 1];
            }

            if (sub.charAt(i) == sub.charAt(x)) {
                x ++;
            }
            n [i] = x;
        }
        return n;
    }
}
