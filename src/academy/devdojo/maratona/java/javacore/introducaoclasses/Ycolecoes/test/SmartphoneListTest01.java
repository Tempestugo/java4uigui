package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1","Iphone");
        Smartphone s2 = new Smartphone("22222","Pixel");
        Smartphone s3 = new Smartphone("33333","Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        smartphones.add(0,new Smartphone("44444","Tablet"));
//        smartphones.clear();



        Smartphone s4 = new Smartphone("33333","Samsung");
        System.out.println(smartphones.contains(s4));
        //se ele não encontrar, ele retorna -1. Nisso é possível fazer um if


        // Java se encarrega de chamar o equals (public boolean equals Object obs)
        int i = smartphones.indexOf(s4);
        System.out.println(i);
        System.out.println(smartphones.get(i));
        System.out.println("====================");
        for(Smartphone smartphone:smartphones){
            System.out.println(smartphone);
        }


    }
}
