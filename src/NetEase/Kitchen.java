package NetEase;
import java.util.*;
/**
 * Created by qq940 on 2018/2/6.
 */
public class Kitchen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i ++) {
                set.add(arr[i]);
            }
        }
        System.out.println(set.size());
        set.clear();
    }
}
