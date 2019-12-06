
/**
 * @author shell4j
 */
public class RemoveDuplicates {
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
