package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Consumidor;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Smartphone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class ConsumidorTest01 {
   public static void main(String[] args) {
       HashMap<Consumidor, Smartphone> smartphones = new HashMap<>();
       Consumidor c1 = new Consumidor("Lala",21L);
       Smartphone s1 = new Smartphone("1234","Xiaomi", 100);
       Smartphone s2 = new Smartphone("1231234","Batata", 200);


       Smartphone put = smartphones.put(c1, s1);
       Smartphone put2 = smartphones.put(c1, s2);
       System.out.println(put2);

       Iterator<Consumidor> it = smartphones.keySet().iterator();
       while (it.hasNext()) {
           Consumidor c = it.next();
           Smartphone s = smartphones.get(c);
           System.out.println(c.getNome() + " " +s.getMarca());
       }
       Iterator<Consumidor> it1 = smartphones.keySet().iterator();
       while (it.hasNext()) {
           Consumidor c = it.next();
           Smartphone s = smartphones.get(c); // Recupera o valor atual (iPhone)
           System.out.println(c.getNome() + " tem um " + s.getMarca());
       }

    }
}
