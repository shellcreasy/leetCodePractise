package others;

/**
 * @author shell
 * @date 2020.3.10
 */
public class MissingNumber {
    /**
     * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [3,0,1]
     * 输出: 2
     * 示例 2:
     * <p>
     * 输入: [9,6,4,2,3,5,7,0,1]
     * 输出: 8
     * 说明:
     * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int a = 0;
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < nums.length; i++) {
                if (a == nums[i]) {
                    a++;
                    break;
                }
                if (i == nums.length - 1 && a != nums[i]) {
                    flag = false;
                }
            }
        }
        return a;
    }
}
