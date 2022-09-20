package leetCode;

import java.util.Arrays;

public class MoveAllZero {
    public static void moveZeroes(int[] nums) {

        int i=0 ,j=0,count =0;
        while (i < nums.length){
            if (nums[i] != 0){
                nums[j++] = nums[i++];
                continue;
            }
            if (nums[i] ==0){
                count++;
                i++;
            }
        }

        for (int k=nums.length-count ; k< nums.length ; k++){
            nums[k] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] array = {0};
        moveZeroes(array);
    }
}
