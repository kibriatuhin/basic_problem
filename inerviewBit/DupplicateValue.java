package inerviewBit;

import java.util.*;

public class DupplicateValue {
    static void dupplicateValue(int[] array){
        for (int i=0 ;i< array.length-1 ; i++){
            for (int j = i+1 ; j< array.length ; j++){
                if (array[i] == array[j]){
                    System.out.println(array[j]);
                    break;
                }
            }
        }
    }
    static void dupplicateValue1(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i=0 ;i< array.length ; i++){
            if (set.contains(array[i])){
                System.out.println(array[i]);
                break;
            }else
                set.add(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {5,6,1,2,1,9};
        dupplicateValue1(array);
    }
}

class DupplicatevalueRemove{
    static void removeDupplicate(int[] array){
        Arrays.sort(array);
        int j=0;
        for (int i=0 ; i< array.length-1 ;i++){
            if (array[i] != array[i+1]){
                array[j++] = array[i];
            }
        }
        array[j] = array[array.length-1];
        System.out.println(Arrays.toString(array));
    }
    static void removeDupplicate2(int[] array){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i=0 ; i< array.length ; i++){

            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);

            }else {
                map.put(array[i],1);
            }

        }
        map.forEach((i,j)-> System.out.print(i + " "));
    }
    public static void main(String[] args) {
        int[] array = {5,6,6,10,7,7,9,10};
        removeDupplicate(array);
    }
}
