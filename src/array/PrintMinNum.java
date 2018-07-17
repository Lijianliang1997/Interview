package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author lijianliang
 * @date 2018/7/17.
 */
public class PrintMinNum {
    public String PrintMinNumber(int [] numbers) {
        ArrayList<String> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(String.valueOf(num));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : list){
            sb.append(s);
        }
        return sb.toString();
    }
}
