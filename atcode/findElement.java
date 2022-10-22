package atcode;

public class findElement {
    public static void findElement1(int[] array , int target){
        for (int i=0 ; i< array.length ; i++){
            if (array[i] == target){
                System.out.println(i);
                break;
            }
        }

    }
    public static void findElement2(int[] array ,  int target ){
        int si = 0 ;
        int ed = array.length-1;
        while (si <= ed){
            int mid = si + (ed- si)/2;
            if (array[mid] == target){
                System.out.println(mid);
                break;
            }
           else if (array[mid] < target){
                si = mid +1;
            }
            else {
                ed = mid-1;
            }

        }
    }
    public static void main(String[] args) {
        int[] array = {5,1,3,4};
        int[] array2 = {1,3,4,5};
        findElement2(array2, 5);
    }
}
