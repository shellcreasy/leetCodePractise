package array;

/**
 * @author shell4j
 */
public class Rotate {
    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,2,3,4,5,6,7] 和 k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
     *
     * @param nums
     * @param k
     * @return
     */
    public static int[] rotate(int[] nums, int k) {
        if (k > 0 && nums.length > 1) {
            int tmp = 0;
            if (nums.length != 2) {
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (i > 0 && i != 1) {
                        if (i == nums.length - 1) {
                            tmp = nums[0];
                            nums[0] = nums[i];
                            nums[i] = nums[i - 1];
                        }
                        nums[i] = nums[i - 1];
                    } else {
                        nums[1] = tmp;
                    }
                }
            } else {
                tmp = nums[1];
                nums[1] = nums[0];
                nums[0] = tmp;
            }
            k = k - 1;
            rotate(nums, k);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -100, 3, 99};
        int[] result = rotate(nums, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
