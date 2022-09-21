package atcode;

import java.util.Scanner;

public class AnywayTakahashi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b= sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        int result =  (a+b)*(c-d);
        System.out.println(result + "\n" + "Takahashi");
    }
}
