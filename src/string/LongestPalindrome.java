package string;

/**
 * Created by qq940 on 2018/4/8.
 */
public class LongestPalindrome {
    public String longestPalindrome (String s) {
        int n = s.length();
        String res = "";
        boolean[][] dp = new boolean[n][n];
        int left = 0;
        int right = 0;
        int max = 0;
        for (int j = 0; j < n; j  ++) {
            dp[j][j] = true;
            for (int i = 0; i < j; i ++) {
                dp[i][j] =  (j - i < 2 || dp[i + 1][j - 1]) && s.charAt(i) == s.charAt(j);
                if ( dp[i][j] && j - i + 1 > max) {
                    left = i;
                    right = j;
                    max = j - i + 1;
                }
            }
        }
        return s.substring(left, right + 1);
    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String s = "babaddtattarrattatddetartrateedredividerb";
        System.out.println(longestPalindrome.longestPalindrome(s));
    }
}
