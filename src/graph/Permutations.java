package graph;

import java.util.*;

/**
 * @author lijianliang
 * @date 2018/7/14.
 */
public class Permutations {
    public ArrayList<String> Permutation(String str) {
        String[] strs = str.split("");
        Arrays.sort(strs);
        List<String> permuteList = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        boolean[] visited = new boolean[str.length()];
        backtracking(permuteList, visited, strs, res, set);
        return res;
    }

    private void backtracking (List<String> permuteList, boolean[] visited,
                               String[] strs, List<String> ret, Set<String> set) {
        if (permuteList.size() == strs.length) {
            StringBuilder sb = new StringBuilder();
            for (String s: permuteList) {
                sb.append(s);
            }
            String s = sb.toString();
            if (set.contains(s)) {
                return;
            } else {
                ret.add(s);
                set.add(s);
                return;
            }
        }
        for (int i = 0; i < visited.length; i ++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            permuteList.add(strs[i]);
            backtracking(permuteList, visited, strs, ret, set);
            permuteList.remove(permuteList.size() - 1);
            visited[i] = false;
        }
    }
}
