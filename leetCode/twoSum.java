package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    static void twoSum(int[] nums, int target) {
        //int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    System.out.println(i + " " + j);
            }
        }
    }

    static int[] twoSum2(int[] nums, int target) {
       // Arrays.sort(nums);
        int[] result = new int[2];

        int l = 0, h = nums.length - 1;
        while (l < h) {
            if (nums[l] + nums[h] == target) {
                result[0] = l+1;
                result[1] = h+1;
                break;
            } else if (nums[l] + nums[h] > target)
                h--;
            else if (nums[l] + nums[h] < target)
                l++;

        }
        return result;
    }

    static int[] twoSum3(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i< nums.length ;i++){
            map.put(nums[i],i);
        }

        //System.out.println(map.containsKey(3));

        for (int i=0 ; i< nums.length ; i++){
            int rem = target-nums[i];
            if (map.containsKey(rem)){
                if(i==map.get(rem) ) continue;
                result[0] = i;
                result[1] = map.get(rem);
                break;
            }
        }
        return result;

    }


    public static void main(String[] args) {
        int[] array = {2,3,5,9};
        System.out.println(Arrays.toString( twoSum2(array, 5)));
    }
}

class Practice {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(4,0);
        map.put(2,1);
        map.put(5,2);
        map.put(1,3);
        int target =9;



        System.out.println(map.get(4));
    }
}
