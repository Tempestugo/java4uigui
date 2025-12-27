import academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    static void main(String[] args) {
        //Type erasure
        List<String> lista = new ArrayList();
        lista.add("Midoriya");
        lista.add("Neko");
        for(String s : lista){
            System.out.println(s);
        }

        add(lista, new Consumidor("Midoriya"));
        for(String s : lista){
            System.out.println(s);
        }
        //1. Na Inserção: Você usou um método sem Generics (Raw Type), "enganando" o compilador. A JVM aceitou porque, em execução, tudo vira Object.
        //2. Na Leitura: O for tentou transformar esse objeto de volta para String (Cast Implícito) e descobriu que ele era um impostor (Consumidor), quebrando o programa.

    }

}

private static void add(List lista, Consumidor consumidor){
    lista.add(consumidor);
}

void main() {
}
//versão antiga
//List lista = new ArrayList();
//        lista.add("Midoriya");
//        lista.add(123L);
//        lista.add(new Consumidor("Goku"));
//        for(Object o : lista){
//        if(o instanceof Consumidor){
//        System.out.println(o);
//            }
//                    if(o instanceof List){
//        System.out.println(o);
//            }
//                    if(o instanceof Consumidor){
//Consumidor consumidor = (Consumidor) o;
//                System.out.println(o);
//            }
//                    }