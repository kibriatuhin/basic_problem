package atcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void twoSum(int[] array , int target){
        for (int i=0 ; i< array.length-1 ; i++){
            for (int j = i+1 ; j< array.length ; j++){
                if ((array[i] + array[j])== target){
                    System.out.println( array[i] + " " + array[j] );
                    break;
                }
            }
        }
    }
    public static void twoSum2(int[] array , int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i< array.length  ; i++){
            int rem = Math.abs(target - array[i]);
            if (map.containsKey(rem)){
                System.out.println((map.get(rem)-1) + " " + i);
                break;

            }else {
                map.put(array[i],map.getOrDefault(array[i],0)+1);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,1,5,9,3};
        twoSum2(array, 5);
    }
}
