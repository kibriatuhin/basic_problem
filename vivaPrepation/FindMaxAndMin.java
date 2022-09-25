package vivaPrepation;

import java.util.Arrays;
import java.util.TreeSet;

public class FindMaxAndMin {
    //time complexity O(nlogn)
    public static void findMaxAndMin(int[] array){
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[array.length-1]);
    }

    public static void main(String[] args) {
        int[] array = {5,2,6,9};
       // findMaxAndMin(array);
        TreeSet<Integer> treeSet = new TreeSet<>();
        int len =array.length;
        for (int i=0 ; i< len ; i++){
            treeSet.add(array[i]);
        }
        //System.out.println(treeSet);
        int j=0;
        for (int n : treeSet){
            array[j++] = n;
        }
        System.out.println(array[1] + " " + array[array.length-2]);

    }
}
