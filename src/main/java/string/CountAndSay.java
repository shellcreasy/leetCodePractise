package string;

/**
 * @author shell4j
 */
public class CountAndSay {
    /**
     * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
     * <p>
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * 1 被读作  "one 1"  ("一个一") , 即 11。
     * 11 被读作 "two 1s" ("两个一"）, 即 21。
     * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
     * <p>
     * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
     * <p>
     * 注意：整数序列中的每一项将表示为一个字符串。
     * <p>
     * <p>
     * <p>
     * 示例 1:
     * <p>
     * 输入: 1
     * 输出: "1"
     * 示例 2:
     * <p>
     * 输入: 4
     * 输出: "1211"
     *
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        if (n > 30) {
            return "";
        }
        int count = 1;
        String initStr = "1";
        while (n != count) {
            StringBuilder resultStb = new StringBuilder();
            for (int i = 0; i < initStr.length(); ) {
                int countNum = 1;
                for (int j = i; j < initStr.length(); j++) {
                    if (i != j && initStr.charAt(i) == initStr.charAt(j)) {
                        countNum++;
                    }
                    if (i != j && initStr.charAt(i) != initStr.charAt(j)) {
                        break;
                    }
                }
                resultStb.append(countNum).append(initStr.charAt(i));
                i = i + countNum;
            }
            initStr = resultStb.toString();
            count++;
        }
        return initStr;
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(countAndSay(num));
    }
}
