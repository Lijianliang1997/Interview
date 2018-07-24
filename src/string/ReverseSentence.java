package string;

/**
 * @author lijianliang
 * @date 2018/7/24.
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if (str.trim().equals("")) {
            return str;
        }
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length; i >= 0; i --) {
            sb.append(s[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
