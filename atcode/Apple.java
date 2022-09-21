package atcode;

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),n =sc.nextInt(),ndivide,yreslt,nrem,xreslt;
         ndivide = n/3;
         yreslt = ndivide * y;
         nrem = n%3;
         xreslt = nrem *x;
         int result1 = yreslt + xreslt,result2 = x*n;
        System.out.println(Math.min(result1,result2));


    }
}
