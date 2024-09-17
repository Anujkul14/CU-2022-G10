package lec45;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();

        map.put("Apple",10);
        map.put("Banana",5);
        map.put(null,10);
        map.put("Fruit",null);
        map.put("Apple",10);

        //null values allowed
        System.out.println(map);

        map.remove("Apple");
        System.out.println(map);

        //to store values in sorted order
        TreeMap <String,Integer> map2 = new TreeMap<>();
        map2.put("Banana",5);
        map2.put("Apple",10);
        map2.put("Cherry",10);
        map2.put("Apple",20);
        System.out.println(map2);

        for(String key : map2.keySet())
        {
            System.out.println(map2.get(key));
        }


    }
}
