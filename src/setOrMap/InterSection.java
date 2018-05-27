package setOrMap;

import java.util.*;

/**
 * Created by qq940 on 2018/2/26.
 */
public class InterSection {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> record = new TreeSet<>();
        for (int num : nums1) {
            record.add(num);
        }
        TreeSet<Integer> resultSet = new TreeSet();
        for (int num : nums2) {
            if (record.contains(num)) {
                resultSet.add(num);
            }
        }
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (Integer num : resultSet) {
            result[index ++] = num;
        }
        return result;
    }

    public int[] intersect (int[] nums1, int[] nums2) {
        TreeMap<Integer, Integer> record = new TreeMap<>();
        for (int num : nums1) {
            if (!record.containsKey(num)) {
                record.put(num, 1);
            } else {
                record.put(num, record.get(num) + 1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums2) {
            if (record.containsKey(num) && record.get(num) > 0) {
                result.add(num);
                record.put(num, record.get(num) - 1);
                if (record.get(num) == 0) {
                    record.remove(num);
                }
            }
        }
        int[] ret = new int[result.size()];
        int index = 0;
        for(Integer num: result) {
            ret[index++] = num;
        }
        return ret;
    }

    private static void printArr(int[] arr){
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = (new InterSection()).intersection(nums1, nums2);
        int[] ret = (new InterSection()).intersect(nums1, nums2);
        printArr(res);
        printArr(ret);
    }
}
