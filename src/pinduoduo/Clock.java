package pinduoduo;

import java.util.Scanner;

/**
 * Created by qq940 on 2018/4/3.
 */
public class Clock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        String[] nums = time.split(":");
        double hours = Double.parseDouble(nums[0]);
        double minutes = Double.parseDouble(nums[1]);
        calAngle(hours, minutes);
    }

    public static void calAngle (double hours, double minutes) {
        double hourAngle = (30 * hours + 0.5 * minutes) % 360;
        double minuteAngle = 6 * minutes;
        double ret = Math.abs(hourAngle - minuteAngle);
        StringBuilder sb = new StringBuilder();
        if (isInteger(ret)) {
            sb.append(ret + "");
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        } else {
            System.out.println(ret);
        }
    }

    public static boolean isInteger(double num) {
        double eps = 1e-10;  // 精度范围
        return num-Math.floor(num) < eps;
    }
}
