package vivaPrepation;

import java.util.HashSet;
import java.util.Set;

public class DupplicateELement {
    //time complexity = O(n2)
    public static void dupplicate(int[] array){
        for (int i=0 ; i< array.length ; i++){
            for (int j = i+1 ; j< array.length ; j++){
                if (array[i] == array[j]){
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }

    //time complexity O(n)

    public static void dupplicate2(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int i=0  ; i< array.length ; i++){
            if (set.contains(array[i])){
                System.out.println(array[i]);
                break;
            }else {
                set.add(array[i]);
            }
        }
    }



    public static void main(String[] args) {
        int[] array = {1,2,3,2};
        dupplicate2(array);

    }
}
