package array;

import java.util.ArrayList;
import java.util.Arrays;

/**输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * Created by qq940 on 2018/1/3.
 */
public class ReOrderArray {
    public static void reOrderArray (int [] array) {
        if (array.length == 0) {
            return;
        }
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 0; i < array.length; i ++) {
            if (array[i] % 2 == 0) {
                evens.add(array[i]);
            } else {
                odds.add(array[i]);
            }
        }
        for (Integer odd : odds) {
            result.add(odd);
        }
        for (Integer even : evens) {
            result.add(even);
        }
        for(int i = 0; i < result.size(); i ++) {
            array[i] = result.get(i);
        }
    }

    public static void main(String[] args) {

    }
}
