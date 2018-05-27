package dp;

/**
 * Created by qq940 on 2018/1/3.
 */
public class JumpFloor {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * 当n大于2的时候 肯定是从n-1或n-2处跳上来的额，所以把前两节台阶的跳法加起来
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * 每节台阶都可以选择跳或不跳 所以是 2^n-1
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        return (int)Math.pow(2, target - 1);
    }
}
