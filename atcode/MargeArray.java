package atcode;

import java.util.Arrays;

public class MargeArray {
    static void margedArray(int[] array1 , int[] array2 ){
        int[] newArray = new int[array1.length + array2.length];
        int a1 = 0 , a2 =0 , n=0;
        while (a1< array1.length  && a2 < array2.length){
            if (array1[a1] > array2[a2]){
                newArray[n++] = array2[a2++];
            }else {
                newArray[n++] = array1[a1++];
            }
        }
        while (a1< array1.length){
            newArray[n++] = array1[a1++];
        }
        while (a2< array2.length){
            newArray[n++] = array2[a2++];
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static void main(String[] args) {
        int[] array1 = {5,6,9};
        int[] array2 = {1,10,11};
        margedArray(array1,array2);
    }
}
