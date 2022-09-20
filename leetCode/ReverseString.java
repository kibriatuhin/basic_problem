package leetCode;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s){
        int l=0,h=s.length-1;
        while (l<h){
            char temp = s[l];
            s[l++] = s[h];
            s[h--] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        reverseString(ch);
    }
}
