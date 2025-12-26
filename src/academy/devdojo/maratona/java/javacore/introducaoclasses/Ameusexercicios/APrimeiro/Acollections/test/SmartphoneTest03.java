package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class SmartphonePrecoComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class SmartphoneTest03 {
    static void main(String[] args) {
        ArrayList<Smartphone> smartphones = new ArrayList<>();
        Smartphone s1 = new Smartphone("1234","Batata", 100);
        Smartphone s2 = new Smartphone("1234","Xiaomi", 800);
        Smartphone s3 = new Smartphone("3","IOS", 900);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        Collections.sort(smartphones);
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone.getMarca());
        }

        System.out.println("=============");

        smartphones.sort(new SmartphonePrecoComparator());
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone.getMarca());
        }

    }
}
