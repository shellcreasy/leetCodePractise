package math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shell
 * @date 2020.3.17
 */
public class FizzBuzz {
    /**
     * 写一个程序，输出从 1 到 n 数字的字符串表示。
     * <p>
     * 1. 如果 n 是3的倍数，输出“Fizz”；
     * <p>
     * 2. 如果 n 是5的倍数，输出“Buzz”；
     * <p>
     * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
     * <p>
     * 示例：
     * <p>
     * n = 15,
     * <p>
     * 返回:
     * [
     * "1",
     * "2",
     * "Fizz",
     * "4",
     * "Buzz",
     * "Fizz",
     * "7",
     * "8",
     * "Fizz",
     * "Buzz",
     * "11",
     * "Fizz",
     * "13",
     * "14",
     * "FizzBuzz"
     * ]
     *
     * @param n
     * @return
     */
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(16);
        if (n < 1) {
            return null;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                list.add(String.valueOf(i));
            }
            if (i % 3 == 0 && i % 5 != 0) {
                list.add("Fizz");
            }
            if (i % 3 != 0 && i % 5 == 0) {
                list.add("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 15;
        List<String> list = fizzBuzz(n);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
