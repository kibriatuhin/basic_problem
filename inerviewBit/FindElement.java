package inerviewBit;

public class FindElement {
    static int findElement(int[] array , int value){
        for (int i=0 ; i< array.length ;i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
    static int findElement1(int[] array , int value){
       int l=0 , h=array.length-1;
       while (l<h){
           int mid = l + (h-l)/2;
           if (array[mid] == value ){
               return mid;
           } else if (mid > value) {
               l = mid+1;
           }else {
               h = mid-1;
           }
       }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {5,6,7,8,9};

        System.out.println(findElement1(array,7));
    }
}
