package setOrMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by qq940 on 2018/5/15.
 */
public class InterleavingString {
    public boolean isInterleave (String s1, String s2, String s3) {
       int len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
       if (len1 + len2 != len3) {
           return false;
       }
       boolean[][] dp = new boolean[len1 + 1][len2 + 1];
       dp[0][0] = true;
       for (int i = 0; i < len1 + 1; i ++) {
           for (int j = 0; j < len2 + 1; j ++) {
               if(j > 0){
                   dp[i][j] = dp[i][j-1]&&(s3.charAt(i+j-1) == s2.charAt(j-1));
               }
               if(i > 0){
                   dp[i][j] = dp[i][j] || ( dp[i-1][j]&&(s3.charAt(i+j-1) == s1.charAt(i-1)));
               }
           }
       }
       return dp[len1][len2];
    }

    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
        InterleavingString interleavingString = new InterleavingString();
        System.out.println(interleavingString.isInterleave(s1, s2, s3));
    }
}
