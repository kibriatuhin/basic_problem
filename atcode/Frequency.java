package atcode;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    static void frequency(int[] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i< array.length ; i++){
           /* if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1 );
            }else
                map.put(array[i],1 );*/
            map.put(array[i],map.getOrDefault(array[i] , 1) );
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] array = {2,1,2,4,5,1};
        frequency(array);
    }
}
