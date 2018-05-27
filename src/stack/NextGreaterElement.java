package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by qq940 on 2018/3/24.
 */
public class NextGreaterElement {
    public static int[] nextGreaterElement (int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int num : nums2) {
            while (!st.isEmpty() && st.peek() < num) {
                map.put(st.pop(), num);
            }
            st.add(num);
        }
        int[] ret = new int[nums1.length];
        for (int i = 0; i < nums1.length; i ++) {
            if (map.containsKey(nums1[i])) {
                ret[i] = map.get(nums1[i]);
            }
            else {
                ret[i] = -1;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 1, 2};
        int[] arr2 = {1, 3,4, 2};
        nextGreaterElement(arr1, arr2);
    }
}
