package array;

/**
 * Created by qq940 on 2018/5/30.
 */
public class ContainerWithMostWater {
    public int maxArea (int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            res = Math.max(area, res);
            if (height[l] > height[r]) {
                r --;
            } else {
                l ++;
            }
        }
        return res;
    }
}
