package leetCode;

import java.util.Arrays;

public class LargePrimeterTriangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int result =0;

        for (int i= nums.length-1 ; i>=2 ; i--){
            if ((nums[i-1]+nums[i-2]) > nums[i]){
                return nums[i] + nums[i-1] + nums[i-2];

            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] array = {2,1,2};
        System.out.println(largestPerimeter(array));
    }
}
