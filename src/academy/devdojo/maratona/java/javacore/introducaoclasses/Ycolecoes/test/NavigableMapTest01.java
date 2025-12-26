package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        NavigableMap<String, Consumidor> consumidormap = new TreeMap<>();
        consumidormap.put("William Suane", consumidor);

        NavigableMap<String, String> map = new TreeMap<>();
        map.put("C","Letra C");
        map.put("A","Letra A");
        map.put("D","Letra D");
        map.put("B","Letra B");
        map.put("E","Letra E");


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println(map.headMap("C").remove("A"));
        System.out.println(map.headMap("D", true));
        System.out.println(map);
        System.out.println(map.ceilingEntry("C"));
        System.out.println(map.floorEntry("A"));
        System.out.println(map.floorEntry("D"));
        System.out.println(map.lowerEntry("A"));
        System.out.println(map.lowerEntry("D"));
        System.out.println(map.higherEntry("A"));
        System.out.println(map.higherEntry("D"));
    }
}
