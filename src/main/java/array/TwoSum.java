package array;

import java.util.*;

/**
 * @author shell4j
 */
public class TwoSum {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * <p>
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> numSet = new LinkedHashSet<Integer>(16);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    numSet.add(i);
                    numSet.add(j);
                }
            }
        }

        int[] nums1 = new int[numSet.size()];
        Iterator<Integer> iterator = numSet.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            int number = iterator.next();
            nums1[index] = number;
            iterator.remove();
            index++;
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        nums = twoSum(nums, 9);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
