package atcode;

import java.util.Scanner;

public class Contest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),n2,sum=0;
        for (int i=0 ;i< n ; i++){
            n2 = sc.nextInt();
            sum = sum + n2;
        }
        System.out.println(sum);
    }
}
