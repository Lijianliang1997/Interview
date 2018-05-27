package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qq940 on 2018/3/5.
 */
public class LetterCombination {
    private String letterMap[] = {
            " ", // 0
            "", // 1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };
    private ArrayList<String> res ;
    public List<String> letterCombination (String digits) {
        res = new ArrayList<>();
        if (digits.equals("")) {
            return res;
        }
        findCombination(digits,0,"");
        return res;
    }
    public void findCombination (String digits, int index, String s) {
        System.out.println(index + ": " + s);
        if (index == digits.length()) {
            res.add(s);
            System.out.println("get " + s + ", return");
            return;
        }
        Character c = digits.charAt(index);
        String letters = letterMap[c - '0'];
        for (int i = 0; i < letters.length(); i ++) {
            System.out.println("digits[" + index + "] = " + c +
                    " , use " + letters.charAt(i));
            findCombination(digits, index+1, s + letters.charAt(i));
            System.out.println("digits[" + index + "] = " + c + " complete, return");
        }
        return;
    }
    private static void printList(List<String> list){
        for(String s: list)
            System.out.println(s);
    }

    public static void main(String[] args) {

        printList((new LetterCombination()).letterCombination("234"));
    }
}
