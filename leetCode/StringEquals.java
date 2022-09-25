package leetCode;

import java.util.Scanner;

public class StringEquals {
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;
        if (s1.length() != s2.length())
            return false;
        char[] ch = s2.toCharArray();
        int f=0,l=ch.length-1;
        char temp = ch[f];
        ch[f] = ch[l];
        ch[l] = temp;
        s2 = String.valueOf(ch);
        //System.out.println(s2);
        return s1.equals(s2);

    }
    public static void main(String[] args) {
        System.out.println( areAlmostEqual("siyolsdcjthwsiplccjbuceoxmpjgrauocx","siyolsdcjthwsiplccpbuceoxmjjgrauocx"));
    }
}

