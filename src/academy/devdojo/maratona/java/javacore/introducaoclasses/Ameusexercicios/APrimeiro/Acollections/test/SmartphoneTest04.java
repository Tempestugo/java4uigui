package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Acollections.dominio.Smartphone;

import java.util.*;

public class SmartphoneTest04 {
    static void main(String[] args) {
        ArrayList<Smartphone> smartphones = new ArrayList<>();

        Smartphone s1 = new Smartphone("1234","Xiaomi", 100);
        Smartphone s2 = new Smartphone("1234","Xiaomi", 800);
        Smartphone s3 = new Smartphone("3","IOS", 0);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

//        System.out.println("============================");
//        for (int ia = 0; ia <smartphones.size(); ia++){
//            if(smartphones.get(ia).getPreco() < 0){
//                smartphones.remove(smartphones.get(ia));
//                ia--;
//
//            }
//
//        }
//        System.out.println(smartphones);
//        System.out.println("============================");

        System.out.println("============================");
        Iterator<Smartphone> iterator = smartphones.iterator();
        while (iterator.hasNext()) {
            // 1. Pega o objeto APENAS UMA VEZ
            Smartphone smartphone = iterator.next();

            // 2. Verifica a condição na variável
            if (smartphone.getPreco() == 0) { //
                iterator.remove();
                System.out.println("Removido: " + smartphone.getMarca());
            } else {
                System.out.println(smartphone);
            }
        }
        System.out.println("============================");

        SmartphonePrecoComparator smartphonePrecoComparator = new SmartphonePrecoComparator();
        smartphones.sort(smartphonePrecoComparator);
        int i = Collections.binarySearch(smartphones, s1, smartphonePrecoComparator);
        int binarySearch = Collections.binarySearch(smartphones, new Smartphone("1234","asijdoas",200), smartphonePrecoComparator);
        System.out.println(i);
        System.out.println(binarySearch);




        Smartphone[] arraySmartphones = smartphones.toArray(new Smartphone[0]);
        List<Smartphone> list = Arrays.asList(arraySmartphones);

//        List<Object> list = Arrays.asList(array);
        System.out.println(list);






    }
}
