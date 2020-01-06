package string;

/**
 * @author shell4j
 */
public class ReverseInt {
    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 123
     * 输出: 321
     * 示例 2:
     * <p>
     * 输入: -123
     * 输出: -321
     * 示例 3:
     * <p>
     * 输入: 120
     * 输出: 21
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        String s = String.valueOf(x);
        StringBuilder stb = new StringBuilder();
        Long result;
        if (x == 0) {
            return 0;
        } else if (s.charAt(0) == '-') {
            stb.append("-");
            for (int i = s.length() - 1; i >= 1; i--) {
                stb.append(s.charAt(i));
            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                stb.append(s.charAt(i));
            }
        }
        result = Long.valueOf(stb.toString());
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.valueOf(result.toString());
    }
}
