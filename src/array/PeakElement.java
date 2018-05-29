package array;

/**
 * Created by qq940 on 2018/5/29.
 */
public class PeakElement {
    public int findPeakElement(int[] nums) {
        int len = nums.length;

        if( len ==1 || nums[0] > nums[1] )
            return 0;
        if( nums[len-2] < nums[len-1])
            return len-1;
        for( int i = 1 ; i < len-1 ; i++ ){

            if( nums[i] > nums[i-1] && nums[i] > nums[i+1] )
                return i;

            if( nums[i] > nums[i+1] )
                i++;
        }
        return 0;
    }
    public int findPeakElement(int[] nums, int start, int end) {
        int l = 0, r = nums.length - 1;
        // 等号  
        while (l <= r) {
            // 无符号右移，忽略符号位，空位都以0补齐  
            int mid = (l + r) >>> 1;
            // 如果mid-1大，那么peak肯定在l和mid-1之间（闭区间）  
            if (mid - 1 >= 0 &&
                    nums[mid] < nums[mid - 1])
                r = mid - 1;
                // 如果mid+1大，那么peak肯定在mid+1和r之间（闭区间）  
            else if (mid + 1 < nums.length
                    && nums[mid] < nums[mid + 1])
                l = mid + 1;
                // 其他情况（peak在开头或者结尾，或者中间）  
            else
                return mid;
        }
        return -1;
    }
}
