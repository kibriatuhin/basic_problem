package vivaPrepation;

import java.util.Arrays;

public class MissingNUmber {
    public static void missingNumber(int[] array){
        int i=0 , n = array.length,sum1 =0,sum2=0;
        while (i != array.length){
            sum1= sum1 + array[i++];
        }
        for (int j= array[0] ; j<=array[array.length-1] ;j++){
            sum2 = sum2 + j;
        }
        System.out.println(sum2-sum1);
    }

    public static void main(String[] args) {

        int[] array = {1,2,4,5,6};
        missingNumber(array);

    }
}
