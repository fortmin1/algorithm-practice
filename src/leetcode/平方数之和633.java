package leetcode;

/**
 *
 *@author jiahao
 *@since 2025/3/7 周五
 *
 */
public class 平方数之和633 {
    public static void main(String[] args) {

        System.out.println(judgeByDoublePointer(4));
    }
    public static boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }

    public static boolean judgeByDoublePointer(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}


