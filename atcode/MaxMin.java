package atcode;

public class MaxMin {
    static void maxMin(int[] array){
        int max = array[0] , min = array[0] ;
        for (int i=1 ; i< array.length ;i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(max + " " + min);
    }
    public static void main(String[] args) {
        int[] array = {5,6,3,9,1};
        maxMin(array);
    }
}
