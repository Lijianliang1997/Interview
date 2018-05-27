import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by qq940 on 2018/2/5.
 */
public class BigInteger {
    char sign = '0';
    byte[] data;
    public BigInteger() {
        this.data = "0".getBytes();
    }
    public BigInteger(String val) {
        Pattern pattern = Pattern.compile("^-?\\d+$"); //正则表达式，输入字符串要求以 零个或一个 - 开头，其余都是数字
        if (val == null || val.length() <= 0) {
            val = "0";
        }
        Matcher matcher = pattern.matcher(val);
        if (!matcher.find()) {
            throw new IllegalArgumentException("is not a Integer");
        }
        // 获取字符串的第一个字符
        char  firstChar = val.charAt(0);
        // data应该保留第一个非零数字后的字符串
        if (firstChar == '-') {
            if (val.length() >= 2) {
                sign = firstChar;
                val = val.substring(1);
                val = getTemp(val);
            }
        } else {
            val = getTemp(val);
        }
        this.data = val.getBytes();
    }
    /**
     * 得到一个字符串第一个非0后的字符串，如果没有找到，则返回 "0" 。如：00003435534，则返回3435534
     * @return
     */
    private static String getTemp(String value){
        Pattern pattern = Pattern.compile("[^0]{1}"); // 不是0的字符 1为长度
        Matcher matcher = pattern.matcher(value);
        if (matcher.find()) {
            value = value.substring(matcher.start());
        } else {
            value = "0";
        }
        return value;
    }

    public BigInteger add(BigInteger other) {
        BigInteger result = new BigInteger();
        int thisLength = this.data.length;
        int otherLength = other.data.length;
        int shorterLength = thisLength > otherLength ? otherLength : thisLength;
        ArrayList<Byte> resultData = new ArrayList<Byte>();
        int flag = 0; // 表示相加时的进位或者相减时的借位
        int i = thisLength - 1;
        int j = otherLength - 1;
        int k = shorterLength;
        if (other.sign == this.sign ) {
            // 从两个整数的各位开始加
            while (k > 0) {
                Integer temp = new Integer(new String(new byte[]{this.data[i]})) + new Integer(new String(new byte[]{other.data[j]})) + flag;
                flag = temp / 10;
                resultData.add(0, ((temp % 10) + "").getBytes()[0]); //把相加结果保存起来
                k--;
                i--;
                j--;
            }
            // 把多余的位加到结果中
            if (i == -1) {
                while (j >= 0) {
                    Integer temp = new Integer(new String(new byte[]{other.data[j]})) + flag;
                    flag = temp / 10;
                    resultData.add(0, ((temp % 10) + "").getBytes()[0]);
                    j--;
                }
            } else if (j == -1) {
                while (i >= 0) {
                    Integer temp = new Integer(new String(new byte[]{this.data[i]})) + flag;
                    flag = temp / 10;
                    resultData.add(0, ((temp % 10) + "").getBytes()[0]);
                    i--;

                }
            }
            // 最后把flag加进结果中
            if (flag != 0) {
                for (Byte by : (flag + "").getBytes()) {
                    resultData.add(0, by);
                }
            }
            result.sign = other.sign;
        } else { // 符号不同
            if (thisLength > otherLength) { // this表示的整数绝对值大，结果符号与this相同
                result.sign = this.sign;
                resultData = subtract(this.data, other.data);
            } else if (thisLength > otherLength) {
                result.sign = other.sign;
                resultData = subtract(other.data, this.data);
            } else { // 位数相同
                Integer thisInt = 0;
                Integer otherInt = 0;
                // 从第一位开始比较，直到二者不等
                for (int n = 0; n < thisLength; n ++) {
                    thisInt = new Integer(new String(new byte[]{this.data[n]}));
                    otherInt = new Integer(new String(new byte[]{other.data[n]}));
                    if (!thisInt.equals(otherInt)) {
                        break;
                    }
                }
                if (thisInt > otherInt) {
                    result.sign = this.sign;
                    resultData = subtract(this.data, other.data);
                } else {
                    result.sign = other.sign;
                    resultData = subtract(other.data, this.data);
                }
            }
        }
        result.data = new byte[resultData.size()];
        for (int m = 0; m < resultData.size(); m ++) {
            result.data[m] = resultData.get(m);
        }
        return result;
    }
    private ArrayList<Byte> subtract(byte[] larger, byte[] smaller) {
        ArrayList<Byte> resultData = new ArrayList<Byte>();
        int flag = 0;
        int i = larger.length - 1;
        int j = smaller.length - 1;
        int k = smaller.length;
        while (k > 0) {
            Integer temp = new Integer(new String(new byte[] {larger[i]})) - new Integer(new String(new byte[] {smaller[j]})) + flag;
            if (temp < 0) {
                flag = -1;
                temp += 10;
            } else {
                flag = 0;
            }
            resultData.add(0, (temp + "").getBytes()[0]);
            i --;
            j --;
            k --;
        }
        while (i >= 0) {
            Integer temp = new Integer(new String(new byte[] {larger[i]})) + flag;
            if (temp < 0) {
                flag = -1;
                temp += 10;
            } else {
                flag = 0;
            }
            resultData.add(0, (temp + "").getBytes()[0]);
            i--;
        }
        return resultData;
    }

    @Override
    public String toString() {
        String str = new String(this.data);
        str = getTemp(str);
        if (sign == '-' && str != "0") {
            str = sign + str;
        }
        return str;
    }

    public static void main(String[] args) {
        String a1 = "-5453450543044355356576980545345054545453453454344435353254545345054304435535657698087756454543454345454534534543444353532545453450543044355356454543454354353450136546534534545345345054353450136546534534545345345043044355356576980657698087756454543454354353450136546534534545345345054353450136546534534545345345043044355356576980877564545434543543534501877564545434543543534501";
        String b1 = "4545453453454344435353254545345054304435535657698087756454543454354345454534534543444353532545453450543044355356576980877564545434545454534534564545434543543534501365465345345453453450543534501365465345345453453450430443553565769804344435353254545345054304435535657698087756454543454354353450136546534534545345345043543534501365465345345453453450534501365465345345453453450";
        BigInteger a = new BigInteger("-1123");
        BigInteger b = new BigInteger("123");
        System.out.println(a.add(b).toString());
    }

}
