package string;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * Created by qq940 on 2018/5/29.
 */
public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len1 = v1.length;
        int len2 = v2.length;
        int len = Math.min(len1, len2);
        int i = 0;
        for (; i < len; i ++) {
            int num1 = Integer.valueOf(v1[i]);
            int num2 = Integer.valueOf(v2[i]);
            if (num1 == num2) {
                continue;
            } else if (num1 < num2) {
                return -1;
            } else {
                return 1;
            }
        }

        while (len1 > i) {
            if (Integer.valueOf(v1[i++]) != 0) {
                return 1;
            }
        }
        i = len;
        while (len2 > i) {
            if (Integer.valueOf(v2[i++]) != 0) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        CompareVersion compareVersion = new CompareVersion();
        System.out.println(compareVersion.compareVersion("0.1","1.1"));
    }
}
