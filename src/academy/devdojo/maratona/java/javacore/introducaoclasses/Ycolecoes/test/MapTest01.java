package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        Map<String, String> map2 = new LinkedHashMap<>();



        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.putIfAbsent("vc","você");
        System.out.println(map);

        System.out.println("===========");

        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println("===========");
        System.out.println("===========");

        for(String value : map.values()){
            System.out.println(value + ": " + map.get(value));
        }
        System.out.println("===========");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();



    }
}
