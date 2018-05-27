package setOrMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qq940 on 2018/3/1.
 */
public class FourSum {
    public int fourSum(Integer[] A, Integer[] B, Integer[] C, Integer[] D) {
            if (A == null || B == null || C == null || D == null) {
                throw new IllegalArgumentException("illegal argument");
            }

            Map<Integer, Integer> recordAB = new HashMap<>();
            for (int i = 0; i < A.length; i ++) {
                for (int j = 0; j < B.length; j ++) {
                    int sum = A[i] + B[j];
                    if (recordAB.containsKey(sum)) {
                        recordAB.put(sum, recordAB.get(sum) + 1);
                    } else {
                        recordAB.put(sum, 1);
                    }
                }
            }

            Map<Integer, Integer> recordCD = new HashMap<>();
            for (int i = 0; i < C.length; i ++) {
                for (int j = 0; j < D.length; j ++) {
                    int sum = C[i] + D[j];
                    if (recordCD.containsKey(sum)) {
                        recordCD.put(sum, recordCD.get(sum) + 1);
                    } else {
                        recordCD.put(sum, 1);
                    }
                }
            }
            int res = 0;
            for (Integer sum1 : recordAB.keySet()) {
                if (recordCD.containsKey(-sum1)) {
                    res += recordAB.get(sum1) * recordCD.get(-sum1);
                }
            }
            return res;
    }

    public static void main(String[] args) {

    }
}
