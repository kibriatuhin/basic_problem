package inerviewBit;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maximum = nums[0];
        for (int i=0 ;i< nums.length ; i++){
            int count = 0;
            for (int k=i ; k< nums.length ; k++){
                count += nums[k];
                maximum = Math.max(count,maximum);
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
    }
}
