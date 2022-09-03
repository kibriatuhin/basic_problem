package inerviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositiveNegative {
    public static int[] solve(int[] A) {
        int[] rslt = new int[2];
        int positiveCount=0;
        int negativeCount=0;
        for (int i=0 ; i<A.length ;i++){
            if (A[i]>=0)
                positiveCount++;
            else
                negativeCount++;

        }
        rslt[0] = positiveCount;
        rslt[1] = negativeCount;
        return rslt;

    }
    public static void main(String[] args) {
        int[] array = {1, 0, -1};
        System.out.println(Arrays.toString(solve(array)));
    }
}
