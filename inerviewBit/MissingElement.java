package inerviewBit;

public class MissingElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,7};
        int totalSum =0 , arraySum =0;
        for (int i=array[0] ; i<= array[array.length-1] ;i++){
            totalSum+=i;
        }
    }
}
