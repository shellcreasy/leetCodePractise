package string;

/**
 * @author shell4j
 */
public class IsPalindrome {
    /**
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * <p>
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     * <p>
     * 示例 1:
     * <p>
     * 输入: "A man, a plan, a canal: Panama"
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: "race a car"
     * 输出: false
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        String regex = "^[a-z0-9]+$";
        s = s.toLowerCase();
        StringBuilder forStb = new StringBuilder();
        StringBuilder backStb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String strI = String.valueOf(s.charAt(i));
            if (strI.matches(regex)) {
                forStb.append(strI);
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            String strI = String.valueOf(s.charAt(i));
            if (strI.matches(regex)) {
                backStb.append(strI);
            }
        }
        if (forStb.toString().equals(backStb.toString())) {
            return true;
        }
        return false;
    }
}
