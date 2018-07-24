package bit;

/**
 * @author lijianliang
 * @date 2018/7/24.
 */
public class Sum {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (sum > 0) && ((sum += Sum_Solution(-- n)) > 0);
        return sum;
    }
}
