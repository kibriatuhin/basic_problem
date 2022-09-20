package inerviewBit;

import java.util.Arrays;

public class MyProblem {
    public static void main(String[] args) {
        int[] array1 = {5,7,9,25};
        int[] array2 = {1,3,4};
        int[] newArray = new int[array1.length + array2.length];
        int i=0,j=0,n=0;
        while (i != array1.length &&  j !=array2.length ){
            if (array1[i] > array2[j] ){
                newArray[n++] = array2[j++];
            }else if (array1[i] < array2[j]){
                newArray[n++]= array1[i++];
            }
        }
        while (i != array1.length){
            newArray[n++] = array1[i++];
        }
        while (j != array2.length){
            newArray[n++] = array1[j++];
        }
        System.out.println(i + " " + j + " " + n);
        System.out.println(Arrays.toString(newArray));
    }
}
