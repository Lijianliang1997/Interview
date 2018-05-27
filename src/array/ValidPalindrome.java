package array;

/**
 * Created by qq940 on 2018/3/11.
 */
public class ValidPalindrome {
    public boolean isPalindrome (String s, int l ,int r) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l ++;
            r --;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if (s == null) {
            return false;
        }
        int i = 0, j = s.length() -1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
            i++;
            j--;
        }
        return true;
    }
}
