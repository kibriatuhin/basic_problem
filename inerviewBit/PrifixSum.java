package inerviewBit;

import java.util.Arrays;

public class PrifixSum {
    public static void main(String[] args) {
        int[] array = {3,5,1,2,9,4};
        int[] temp = new int[array.length];
        temp[0] =  array[0];
        for (int i=1 ;i<array.length ;i++){
            temp[i] = temp[i-1] + array[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}

class Parent{
    static void displayInformation(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{

    static void displayInformation(){
        System.out.println("child method");
    }


    void showMethod(){
        System.out.println("tuhin");
    }



    public static void main(String[] args) {
        Child ob = new Child();
        ob.displayInformation();
    }
}

