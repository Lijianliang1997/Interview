package string;

/**
 * @author lijianliang
 * @date 2018/7/23.
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        int length = str.length();
        if (length == 0) {
            return str;
        }
        StringBuilder sb1 = new StringBuilder(str.substring(0, n));
        StringBuilder sb2 = new StringBuilder(str.substring(n, length));
        sb2.append(sb1);
        return sb1.toString();
    }
}
