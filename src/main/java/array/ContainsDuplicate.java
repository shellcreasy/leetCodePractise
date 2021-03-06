package array;


import java.util.HashSet;
import java.util.Set;

/**
 * @author shehl4j
 */
public class ContainsDuplicate {
    /**
     * 给定一个整数数组，判断是否存在重复元素。
     * <p>
     * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        boolean isContains = false;
        Set<Integer> numSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!numSet.add(nums[i])) {
                isContains = true;
            }
        }
        return isContains;
    }
}
