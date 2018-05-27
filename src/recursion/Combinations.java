package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qq940 on 2018/2/18.
 */
public class Combinations {
    /**
     * Generate all combinations and output them,
     * selecting n elements from data
     * @param data
     * @param n
     */
    public void combinations(List<Integer> selected,List<Integer> data, int n) {
        if (n == 0) {
            // output all selected elements
            for (Integer i : selected) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        if (data.isEmpty()) {
            return;
        }
        // select element 0
        selected.add(data.get(0));
        combinations(selected, data.subList(1, data.size()), n - 1);
        // un-select element 0
        selected.remove(selected.size() - 1);
        combinations(selected, data.subList(1, data.size()), n);
    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        combinations.combinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4), 2);
        System.out.println("=========================================================");
        combinations.combinations(new ArrayList<>(), new ArrayList<>(), 2);
        System.out.println("=========================================================");
        combinations.combinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4), 0);
        System.out.println("=========================================================");
        combinations.combinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4), 1);
        System.out.println("=========================================================");
        combinations.combinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4), 0);
        System.out.println("=========================================================");
        combinations.combinations(new ArrayList<>(), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), 4);
    }
}
