package array;

/**
 * Created by qq940 on 2017/12/23.
 */
public class BinarySearch {
    private BinarySearch(){}

    public static int binarySearch (Comparable[] arr, int n, Comparable target) {
        int l = 0, r = n - 1; // 在[l...r]中寻找target
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid].compareTo(target) == 0) {
                return mid;
            }
            if (target.compareTo(arr[mid]) > 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
    public static boolean binarySearch (int[][] array, int target) {
        int colLen = array.length;
        int lineLen = array[0].length;
        for (int i = 0; i < colLen; i ++) {
            int left = 0;
            int right = lineLen - 1;
            int mid = 0;
            while (left < right) {
                mid = left + (right - left) / 2;
                if (array[i][mid] == target ) {
                    System.out.println("true");
                    return true;
                } else if (array[i][mid] < target) {
                    left = mid + 1;
                } else if (array[i][mid] > target) {
                    right = mid - 1;
                }
            }
        }
        System.out.println("false");
        return false;

    }

    public static void main(String[] args) {

        int n = (int)Math.pow(10, 7);
        Integer data[] = Util.generateOrderedArray(n);

        long startTime = System.currentTimeMillis();
        int[][] array = {{1,2,8,9},{2,4,9,12}, {4,7,10,13}, {6,8,11,15}};
        binarySearch(array,7);
//
//        for(int i = 0 ; i < n ; i ++)
//            if(i != binarySearch(data, n, i))
//                throw new IllegalStateException("find i failed!");
        long endTime = System.currentTimeMillis();

        System.out.println("Binary Search test complete.");
        System.out.println("Time cost: " + (endTime - startTime) + " ms");
    }
}
