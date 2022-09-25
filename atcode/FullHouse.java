package atcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FullHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] array = new int[5];
        Map<Integer, Integer> map = new HashMap<>();
        while (i != 5) {
            array[i++] = sc.nextInt();

        }
        for (int j = 0; j < 5; j++) {
            map.put(array[j], map.getOrDefault(array[j], 0) + 1);
        }
        if (map.containsValue(3) && map.containsValue(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}

class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 1);
        map.put(3, 1);
        map.put(4, 1);
        System.out.println(map);
        if (map.containsKey(2)) {
            map.put(2, map.get(2) + 1);
        }
        System.out.println(map);
    }
}
