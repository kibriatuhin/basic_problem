package inerviewBit;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0 ; i< nums.length-1 ;i++){
            for (int j = i+1 ; j< nums.length ; j++){
                if ((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
    public static void twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i=0 ;i< nums.length ; i++){
            int rem = Math.abs((target - nums[i]));
            if (map.containsKey(rem)){
                System.out.println(map.get(rem) + " " + i);
                break;
            }
            map.put(nums[i],i);
        }

    }

    public static void twoPare(int[] nums , int target){
        for (int i=0 ;i< nums.length ; i++){
            for (int j= i+1 ; j< nums.length ; j++){
                if ((nums[i] + nums[j])==target){
                    System.out.println(nums[i] + " " + nums[j]);

                }
            }
        }

    }
    public static void twoPare2(int[] nums , int target){
       Map<Integer, Integer> map = new HashMap<>();
       for (int i=0 ;i< nums.length ; i++){
           int rem = Math.abs(target-nums[i]);
           if (!map.containsKey(rem))
               System.out.println(map.get(rem) + " " +i);
           map.put(nums[i],i);
       }
    }
    public static void twoPare3(int[] nums , int target){
        Set<Integer> set = new HashSet<>();
       for (int val : nums){
           int rem = Math.abs(target-val);
           if (!set.contains(rem)){
               set.add(val);
           }else {
               System.out.println(val + " " + rem);
           }
       }
    }

    public static void main(String[] args) {
        int[] array = {8,1,5,4,3,6,7};
        twoPare3(array,9);
    }
}
