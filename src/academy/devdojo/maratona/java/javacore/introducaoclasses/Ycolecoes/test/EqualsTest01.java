package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    static void main(String[] args) {
//        String nome1 = "Maria";
//        String nome2 = new String ("Maria");
//        System.out.println(nome1.equals(nome2));
        Smartphone s1 = new Smartphone("1ABC1","Iphone");
        Smartphone s2 = s1;
//        Smartphone s2 = new Smartphone("1ABC1","Iphone");
        System.out.println(s1.equals(s2));


    }
}
