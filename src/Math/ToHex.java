package Math;

/**
 * Created by qq940 on 2018/4/6.
 */
public class ToHex {
    public char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public String toHex (int num) {
        if (num == 0) {
            return "0";
        }
        String s = "";
        while (num != 0) {
            s =  map[num & 15] + s;
            num = num >>> 4;
        }
        return s;
    }

    public static void main(String[] args) {
        ToHex toHex = new ToHex();
        System.out.println(toHex.toHex(-1));
    }
}
