package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Smartphone;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SmartphoneTest06 {
   public static void main(String[] args) {
        TreeSet<Smartphone> treeSet = new TreeSet<>(new SmartphonePrecoComparator());

        Smartphone s1 = new Smartphone("1234","Xiaomi", 100);
        Smartphone s2 = new Smartphone("1234","Xiaomi", 800);
        Smartphone s3 = new Smartphone("3","IOS", 0);
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);

       System.out.println(treeSet.lower(new Smartphone("1234", "ba", 10)));
       System.out.println(treeSet.higher(new Smartphone("1234", "la", 8030)));

       System.out.println(treeSet.pollFirst());
       System.out.println(treeSet);



    }
}
