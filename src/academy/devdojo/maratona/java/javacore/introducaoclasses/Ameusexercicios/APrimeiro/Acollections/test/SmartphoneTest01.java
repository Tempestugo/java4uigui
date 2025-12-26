package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Smartphone;

public class SmartphoneTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1234","Xiaomi", 100);
        Smartphone s2 = new Smartphone("1234","Xiaomi", 800);
        if(s1 == s2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        if(s1.equals(s2)){
            System.out.println(true);
        }else  {
            System.out.println(false);
        }

    }
}
