package credit;

import java.util.*;

/**
 * Created by qq940 on 2018/5/7.
 */
public class StringAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr = str.split(";");
        String A = arr[0];
        String B = arr[1];
        System.out.println(ifContain(A, B));
    }

    public static boolean ifContain (String A, String B) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < A.length(); i ++) {
            set.add(A.charAt(i));
        }
        for (int i = 0; i < B.length(); i ++) {
            if (!set.contains(B.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
