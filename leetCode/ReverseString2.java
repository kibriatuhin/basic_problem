package leetCode;

public class ReverseString2 {
    public static String  reverseWord(String s){
        String[] strings = s.split(" ");
        String result = "";
        for (String s1 : strings){
            char[] ch = s1.toCharArray();
            int l=0 , h= ch.length-1;
            while (l<h){
                char temp = ch[l];
                ch[l++] = ch[h];
                ch[h--] = temp;
            }
            result = result + String.valueOf(ch) + " ";
        }
        result = result.trim();
        //System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        reverseWord(s);
    }
}
