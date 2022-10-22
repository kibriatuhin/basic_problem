package atcode;

import java.util.*;


class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] array = new int[26];
        for (int i=0 ; i< s.length() ; i++){
            array[s.charAt(i) - 'a']++;
        }
        //System.out.println(Arrays.toString(array));
        for (int i=0  ; i< array.length ; i++){
            if (array[i] == 1){
                System.out.println((char) (i+'a'));
                return;
            }
        }
        System.out.println(-1);
    }

}

public class UniqString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        char[] ch = s.toCharArray();
        for (char c : ch){

            set.add(c);

        }
        if (set.size() == 1)
            System.out.println(-1);
        else {
            Iterator it = set.iterator();
            System.out.println(it.next());
        }

    }
}