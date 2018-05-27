package binarySearch;

/**
 * Created by qq940 on 2018/3/7.
 */
public class Sqrt {
//    public static int mySqrt(int x) {
//        int l = 0;
//        int r = x;
//        while (l < r) {
//            int mid = l + (r - l) / 2;
//            int sqrt = x / mid;
//            if (mid == sqrt) {
//                return mid;
//            } else if (sqrt > mid) {
//                l = mid + 1;
//            } else if (sqrt < mid) {
//                r = mid - 1;
//            }
//        }
//        return r;
//    }

    public static int mySqrt (int x) {
        int l = 0;
        int r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sqrt = x / mid;
            if (mid == sqrt) {
                return mid;
            } else if (sqrt > mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
