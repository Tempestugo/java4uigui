package academy.devdojo.maratona.java.javacore.introducaoclasses.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); //1.4
//        nomes.add("William");
//        nomes.add("DevdDoko");
//
//        for (Object nome : nomes) {
//            System.out.println(nome);
//
//        }
        List<String> nomes = new ArrayList(16); //1.4
        List<String> nomes2 = new ArrayList(16); //1.4


        nomes.add("William");
        nomes.add("DevdDoko");
        System.out.println(nomes.remove("william"));
        // retorna true ou false se consegue remover


        nomes2.add("Academy");
        nomes2.add("Suane");

        nomes.addAll(nomes2);
        System.out.println(nomes);



        nomes.remove(0);
        nomes.remove("William");
        // Aplica o equals

        for (String nome : nomes) {
            System.out.println(nome);
            // dá pra executar as funções da String
            // nomes.add("DevdDoko");  não funciona, pois o for já tem uma ideia do tamanho da lista
            // Iria executar infinito deixando o limite como nomes.size (iria aumentando o tamanho da lista dinamicamente)
            // ideal é fazer que nem abaixo
        }
        int size = nomes.size();
        for(int i = 0; i < size; i++){
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes);

        // Obrigatoriamente usar Wrappers (objetos) em List<>
        List<Integer> numeros = new ArrayList<>();
        // As coleções chamam hash code e equals automaticamente, logo não tem hash code e equals para tipso primitivos
        //
        numeros.add(1);
    }
}
