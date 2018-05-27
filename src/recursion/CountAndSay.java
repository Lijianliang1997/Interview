package recursion;

/**
 * Created by qq940 on 2018/4/2.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        if (str.length() == 1) {
            sb.append(count + str);
        } else {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    sb.append(count + "" + str.charAt(i));
                    count = 1;
                }
            }
            sb.append(count + "" + str.charAt(str.length() - 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(5));
    }
}
