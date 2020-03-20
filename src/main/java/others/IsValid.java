package others;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shell
 * @date 2020.3.16
 */
public class IsValid {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
     * <p>
     * 有效字符串需满足：
     * <p>
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 注意空字符串可被认为是有效字符串。
     * <p>
     * 示例 1:
     * <p>
     * 输入: "()"
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: "()[]{}"
     * 输出: true
     * 示例 3:
     * <p>
     * 输入: "(]"
     * 输出: false
     * 示例 4:
     * <p>
     * 输入: "([)]"
     * 输出: false
     * 示例 5:
     * <p>
     * 输入: "{[]}"
     * 输出: true
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if (s == null) {
            return false;
        } else {
            if (s.equals("")) {
                return true;
            } else {
                List<String> list = new ArrayList<String>();
                for (int i = 0; i < s.length(); i++) {
                    if (list.size() == 0 && !(String.valueOf(s.charAt(i)).equals("(") || String.valueOf(s.charAt(i)).
                            equals("{") || String.valueOf(s.charAt(i)).equals("["))) {
                        return false;
                    } else if (String.valueOf(s.charAt(i)).equals("(") || String.valueOf(s.charAt(i)).
                            equals("{") || String.valueOf(s.charAt(i)).equals("[")) {
                        list.add(String.valueOf(s.charAt(i)));
                    } else if (String.valueOf(s.charAt(i)).equals(")") && list.get(list.size() - 1).equals("(") || String.valueOf(s.charAt(i)).
                            equals("}") && list.get(list.size() - 1).equals("{") || String.valueOf(s.charAt(i)).equals("]") && list.get(list.size() - 1).equals("[")) {

                        list.remove(list.size() - 1);
                        continue;
                    } else {
                        return false;
                    }
                }
                if (list.size() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "()";
        System.out.print(isValid(str));
    }
}
