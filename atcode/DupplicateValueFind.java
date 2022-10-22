package atcode;

import java.util.HashSet;
import java.util.Set;

public class DupplicateValueFind {
    static void findValue(int[] array ){
        for (int i=0  ; i< array.length-1 ; i++){
            for (int j = i+1 ; j< array.length ; j++){
                if (array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
    static void findValue2(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int n : array){
            if (set.contains(n)){
                System.out.println(n);
            }else
                set.add(n);
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,1,3,2,5};
        findValue2(array);
    }
}
