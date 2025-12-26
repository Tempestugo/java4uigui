package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Smartphone;

import java.util.*;

public class SmartphoneTest05 {
    static void main(String[] args) {

        HashSet<Smartphone> hashSet = new HashSet<>();
        HashSet<Smartphone> hashSet2 = new LinkedHashSet<>();

        Smartphone s1 = new Smartphone("1234","Xiaomi", 100);
        Smartphone s2 = new Smartphone("1234","Xiaomi", 800);
        Smartphone s3 = new Smartphone("3","IOS", 0);
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        System.out.println(hashSet);



    }
}
