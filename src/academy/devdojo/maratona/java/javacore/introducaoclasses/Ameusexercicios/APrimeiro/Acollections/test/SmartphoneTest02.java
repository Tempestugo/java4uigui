package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Smartphone;

import java.util.ArrayList;

public class SmartphoneTest02 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1234","Xiaomi", 100);
        Smartphone s2 = new Smartphone("1234","Xiaomi", 800);
        Smartphone s3 = new Smartphone("3","IOS", 900);
        ArrayList<Smartphone> smartphones = new ArrayList<Smartphone>();
        smartphones.add(0,s1);
        smartphones.add(1,s2);
        smartphones.add(2, s3);
        boolean contains = smartphones.contains(s1);
        System.out.println(contains);

        int i = smartphones.indexOf(new  Smartphone("1234","Xiaomi", 100));
        System.out.println(i);
    }
}
