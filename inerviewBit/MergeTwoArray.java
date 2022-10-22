package inerviewBit;

import java.util.Arrays;

public class MergeTwoArray {
    static void marged(int[] array1 , int[] array2){
        int[] newArray = new int[array1.length + array2.length];
        int idx1 = 0, idx2 = 0;
        for (int i=0 ; i< newArray.length ; i++){
            if (idx1 < array1.length){
                newArray[i] = array1[idx1++];
            }else {
                newArray[i] = array2[idx2++];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static void main(String[] args) {
        int[] array1 = {3,5,1,2,7};
        int[] array2 = {9,10,4};
        marged(array1,array2);

    }
}
