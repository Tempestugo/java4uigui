package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Consumidor;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Smartphone;

import java.util.*;

public class ConsumidorTest02 {
   public static void main(String[] args) {
     Map<Consumidor, List<Smartphone>> map = new HashMap<>();
       Consumidor c1 = new Consumidor("Lala",21L);
       Smartphone s1 = new Smartphone("1234","Xiaomi", 100);
       Smartphone s2 = new Smartphone("1231234","Batata", 200);

       List<Smartphone> smartphones = new ArrayList<>();
       smartphones.add(s1);
       smartphones.add(s2);

       map.put(c1,smartphones);
       System.out.println(map.get(c1));
       List<Smartphone> listaDoConsumidor = map.get(c1);
       for (Smartphone s : listaDoConsumidor) {
           System.out.println(" - " + s.getMarca() + " (Preço: " + s.getPreco() + ")");
       }

   }
}
