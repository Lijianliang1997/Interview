package dp;

/**
 * Created by qq940 on 2018/3/21.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }
        int n = nums.length;
        int index = n - 1;
        for (int i = n - 2; i >= 0 ; i --) {
            if (i + nums[i] >= index) {
                index = i;
            }
        }
        return index <= 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1,1,4};
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(arr));
    }
}
