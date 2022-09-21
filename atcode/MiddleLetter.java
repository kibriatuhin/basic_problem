package atcode;

import java.util.Scanner;

public class MiddleLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int idx = s.length()/2;
        System.out.println(s.charAt(idx));
    }
}
