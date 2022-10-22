package atcode;

public class MissingValue {
    static void missingValue(int[] array){
        int st = array[0], ed = array[array.length-1],sum1=0 , sum2 =0;

        for (int i=st ; i<= ed ; i++){
           sum1 += i;
        }
        for (int i=0 ; i< array.length ; i++){
            sum2 += array[i];
        }
        System.out.println(sum1 - sum2);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,7};
        missingValue(array);
    }
}
