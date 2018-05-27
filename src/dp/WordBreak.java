package dp;

import java.util.List;

/**
 * Created by qq940 on 2018/3/16.
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
      int n = s.length();
      boolean[] dp = new boolean[n + 1];
      dp[0] = true;
      for (int i = 0; i <= n; i ++) {
          for (String word : wordDict) {
              if (word.length() <= i && word.equals(s.substring(i - word.length(), i))) {
                  dp[i] = dp[i] || dp[i - word.length()];
              }
          }
      }
      return dp[n];
    }
}
