package string;

import java.math.BigInteger;

/**
 * Created by qq940 on 2018/1/1.
 */
public class ReplaceSpace {
    public static String ReplaceSpace(StringBuffer str) {
        String s = str.toString();
        char[] charStr = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < charStr.length; i ++) {
            if (charStr[i] == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(charStr[i]);
            }
        }
        BigInteger bigInteger = new BigInteger("1232");
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We Are Happy.");
        System.out.println( ReplaceSpace(stringBuffer));
    }
}
