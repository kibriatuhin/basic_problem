package inerviewBit;

public class MinMax {
    public static void main(String[] args) {
        int[] array = {5,1,3,9,2};
        int min = array[0], max = array[0];
        for (int i=1 ; i< array.length ; i++){
            if (max< array[i]){
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
