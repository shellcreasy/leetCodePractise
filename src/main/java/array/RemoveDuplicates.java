package array;

/**
 * @author shell4j
 */
public class RemoveDuplicates {
    /**
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

     不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

     示例 1:

     给定数组 nums = [1,1,2],

     函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。

     你不需要考虑数组中超出新长度后面的元素。
     示例 2:

     给定 nums = [0,0,1,1,1,2,2,3,3,4],

     函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。

     你不需要考虑数组中超出新长度后面的元素。
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        } else {
            int startIndex = 0;
            if (startIndex < nums.length - 1) {
                while (startIndex < nums.length - 1 && nums[startIndex + 1] != Integer.MAX_VALUE) {
                    if (nums[startIndex] == nums[startIndex + 1]) {
                        for (int j = startIndex; j < nums.length; j++) {
                            if (j < nums.length - 1) {
                                nums[j] = nums[j + 1];
                            }
                            if (j == nums.length - 1) {
                                nums[j] = Integer.MAX_VALUE;
                            }
                        }
                    }

                    if (nums[startIndex] != nums[startIndex + 1] && nums[startIndex + 1] != Integer.MAX_VALUE) {
                        startIndex++;
                    }
                }
            }
            return startIndex + 1;
        }
    }

    public static void main(String[] args) {
        int[] input = {2147483647,2147483647,2147483647,2147483647};
        int result = removeDuplicates(input);
        System.out.println(result);
    }
}
