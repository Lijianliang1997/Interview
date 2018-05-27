package NetEase;

import java.util.*;

/**
 * Created by qq940 on 2018/3/25.
 */
public class RemoveElements {
    public static void removeElement (int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i ++) {
            map.put(nums[i], i);
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = n - 1; i >= 0; i --) {
            if (map.containsKey(nums[i]) && !set.contains(nums[i])) {
                arrayList.add(nums[i]);
                set.add(nums[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = arrayList.size() - 1; i >= 0; i --) {
            sb.append(arrayList.get(i) + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0 ; i < n; i ++) {
            nums[i] = in.nextInt();
        }
        removeElement(nums);
    }
}
