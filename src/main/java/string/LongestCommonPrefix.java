package string;


/**
 * @author shell4j
 */
public class LongestCommonPrefix {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * <p>
     * 如果不存在公共前缀，返回空字符串 ""。
     * <p>
     * 示例 1:
     * <p>
     * 输入: ["flower","flow","flight"]
     * 输出: "fl"
     * 示例 2:
     * <p>
     * 输入: ["dog","racecar","car"]
     * 输出: ""
     * 解释: 输入不存在公共前缀。
     * 说明:
     * <p>
     * 所有输入只包含小写字母 a-z 。
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder stb = new StringBuilder("");
        boolean isSameChar = true;
        int index = 0;
        while (isSameChar) {
            char tmp = ' ';
            for (int i = 0; i < strs.length; i++) {
                if (index < strs[i].length()) {
                    if (i == 0) {
                        tmp = strs[i].charAt(index);
                    }
                    if (i != 0 && tmp != strs[i].charAt(index)) {
                        isSameChar = false;
                    }
                } else {
                    isSameChar = false;
                }
            }
            if (isSameChar) {
                stb.append(String.valueOf(tmp));
            } else {
                return stb.toString();
            }
            index++;
        }
        return "";
    }

    public static void main(String[] args) {
        String[] strs = {};
        System.out.println(longestCommonPrefix(strs));
    }
}
