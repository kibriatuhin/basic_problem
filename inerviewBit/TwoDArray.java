package inerviewBit;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        for (int i=0  ; i< 2 ; i++){
            for (int j=0 ; j<3 ; j++){
                array[i][j] = j;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
