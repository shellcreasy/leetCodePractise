package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shell4j
 */
public class MoveZeroes {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * <p>
     * 示例:
     * <p>
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        List<Integer> tmpList = new ArrayList<Integer>(16);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                tmpList.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < tmpList.size()) {
                nums[i] = tmpList.get(i);
            } else {
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
