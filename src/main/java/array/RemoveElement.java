package array;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int length = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j] != val){
                        int tmp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = tmp;
                        break;
                    }
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                length++;
            }else{
                break;
            }
        }
        return length;
    }

    public static void main(String[] args){
        int[] arrays = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arrays,2));
    }

}
