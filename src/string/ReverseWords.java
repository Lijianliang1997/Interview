package string;

/**
 * Created by qq940 on 2018/5/28.
 */

public class ReverseWords {
    public String reverseWords (String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length -1; i >=0 ;i --) {
            if (!strings[i].equals("")) {
                sb.append(strings[i] + " ");
            }
        }
        if (sb.length()!=0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString().trim();
    }
}
