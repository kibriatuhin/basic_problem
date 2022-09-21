package atcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int i=0;
        while (i != array.length){
            array[i++] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int k : array) {
            if (set.contains(k)) {
                continue;
            } else {
                set.add(k);
            }
        }
        System.out.println(set.size());
    }
}
