package academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    static void main(String[] args) {
//        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
//        System.out.println(barcoList);
    }
    private static <T extends Comparable<T>> List <T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }

    public static <T extends Comparable<? super T>> List<T> createList(List<? extends T> list) {
        return List.copyOf(list); // cria uma lista imutável copiando os elementos
    }

}










//class Doisatributos <T,X,I>{
//
//}
