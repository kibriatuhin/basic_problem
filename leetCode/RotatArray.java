package leetCode;

import java.util.Arrays;

public class RotatArray {
    public static void rotateRight(int[] array , int k){
        for (int i=0 ; i<k ; i++){
            int temp = array[array.length-1];
            for (int j=array.length-1 ; j>=1 ; j--){
                array[j] = array[j-1];
            }
            array[0] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array,int low, int high){
        //int h = array.length-1 , l =0;
        while (low < high){
            int temp = array[high];
            array[high--] = array[low];
            array[low++] = temp;
        }


    }

    public static void rotate(int[] nums , int k){
        reverse(nums,0,nums.length-1-k);

        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);

    }


    public static void main(String[] args) {
        int[] array = {3,2,5,7,1};
        int k=2;

        rotate(array,k);

    }
}
