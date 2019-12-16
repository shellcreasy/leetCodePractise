package array;


/**
 * @author shell4j
 */
public class PlusOne {
    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

     最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

     你可以假设除了整数 0 之外，这个整数不会以零开头。

     示例 1:

     输入: [1,2,3]
     输出: [1,2,4]
     解释: 输入数组表示数字 123。
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(0<=digits[i] && digits[i]<9 && i == digits.length-1){
                digits[digits.length-1] = digits[digits.length-1] + 1;
                return digits;
            }
            if(digits[i] != 9){
                digits[i] = digits[i] +1;
                return digits;
            }
            if(i != 0 && digits[i] == 9){
                digits[i] = 0;
            }
            if(i == 0 && digits[i] == 9){
                digits[i] = 0;
                int[] newDigits = new int[digits.length+1];
                for(int j=0;j<newDigits.length;j++){
                    if(j ==0 ){
                        newDigits[j] = 1;
                    }
                    else {
                        newDigits[j] = digits[j-1];
                    }
                }
                return newDigits;
            }
        }
        return digits;
    }
    public static void main(String[] args){
        int[] nums = {9,9,9,9};
        nums = plusOne(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}
