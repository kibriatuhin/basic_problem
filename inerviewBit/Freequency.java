package inerviewBit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Freequency {
    public static void findFrequency(int[] array){
        int[] freq = new int[array.length];
        int visited = -1;
        for (int i=0 ;i< array.length ; i++){
            int count =1;
            for (int j = i+1 ; j< array.length ; j++){
                if (array[i] == array[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited){
                freq[i] = count;
            }
        }
        System.out.println(Arrays.toString(freq));
    }
    public static void findFrequency1(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0  ;i< array.length ; i++){
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i] , 1);
            }

        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] array = {5,7,5,2,1,10,5,10};
        findFrequency1(array);
    }
}
