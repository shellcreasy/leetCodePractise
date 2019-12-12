package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shell4j
 */
public class SingleNumber {
    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

     说明：

     你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>(16);
        for(int i=0;i<nums.length;i++){
            if(!numSet.contains(nums[i])){
                numSet.add(nums[i]);
            }
            else{
                numSet.remove(nums[i]);
            }
        }
        return numSet.iterator().next();
    }

    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        System.out.print(singleNumber(nums));
    }
}
