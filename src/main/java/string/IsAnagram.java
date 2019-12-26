package string;

/**
 * @author shell4j
 */
public class IsAnagram {
    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     * <p>
     * 示例 1:
     * <p>
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: s = "rat", t = "car"
     * 输出: false
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            while (s.length() != 0) {
                int countS = 0, countT = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(0) == s.charAt(i)) {
                        countS = countS + 1;
                    }
                    if (s.charAt(0) == t.charAt(i)) {
                        countT = countT + 1;
                    }
                    if (t.indexOf(s.charAt(0)) == -1) {
                        return false;
                    }
                    if (i == s.length() - 1 && countS != countT) {
                        return false;
                    }
                    if (i == s.length() - 1 && countS == countT) {
                        t = t.replace(String.valueOf(s.charAt(0)), "");
                        s = s.replace(String.valueOf(s.charAt(0)), "");
                    }
                }
            }
            if (s.length() == 0 && t.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
