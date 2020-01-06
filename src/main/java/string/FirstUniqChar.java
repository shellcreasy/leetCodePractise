package string;

/**
 * @author shell4j
 */
public class FirstUniqChar {
    /**
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     * <p>
     * 案例:
     * <p>
     * s = "leetcode"
     * 返回 0.
     * <p>
     * s = "loveleetcode",
     * 返回 2.
     *
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isDuplacte = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isDuplacte = true;
                    break;
                }
            }
            if (isDuplacte) {
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }
}
