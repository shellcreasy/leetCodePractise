package array;

/**
 * @author shell4j
 */
public class Rotate {
    public static int[] rotate(int[] nums, int k) {
        if(k>0 && nums.length>1){
            int tmp=0;
            if(nums.length != 2){
                for(int i=nums.length-1;i>=0;i--){
                    if(i>0 && i != 1){
                        if(i == nums.length-1){
                            tmp = nums[0];
                            nums[0] = nums[i];
                            nums[i] = nums[i-1];
                        }
                        nums[i] = nums[i-1];
                    }
                    else {
                        nums[1] = tmp;
                    }
                }
            }
            else{
              tmp = nums[1];
              nums[1] = nums[0];
              nums[0] = tmp;
            }
            k=k-1;
            rotate(nums,k);
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {-1,-100,3,99};
        int[] result = rotate(nums,2);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
