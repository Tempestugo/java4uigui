package academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.test;


import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Quarto.Gato;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    static void main(String[] args) {
        List<Cachorro> cahorros = List.of(new Cachorro(), new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato(), new Gato());


        List<Animal> animals = new ArrayList<>();
                printConsulta(animals);
//                printConsulta(cahorros);
    }
    //Ao contrário dos arrays, Generics são invariantes. Isso significa que List<Cachorro> NÃO é considerado um subtipo de List<Animal>.
//    private static void printConsulta(List<? extends Animal> animals) {
//        for (Animal animal : animals) {
//            animal.consulta();
//        }
//
//    }
    //• O Problema da Escrita: O Java bloqueia a adição de elementos (add) aqui. Por quê? Porque se você passar uma List<Cachorro>, o Java não pode deixar você adicionar um Gato lá dentro. Como ele não sabe qual filho específico foi passado, ele bloqueia tudo para garantir a segurança.
    //• Para que serve: Serve para leitura. Você tem certeza que o que sair dessa lista é pelo menos um Animal, então pode chamar métodos de Animal (como consulta()),.


    private static void printConsulta(List<? super Animal> animal) {
        Animal animal2 = new Cachorro();
        Animal animal3 = new Gato2();
        animal.add(new Cachorro());
        animal.add(new Gato2());
    }
}
//• O que significa: "Aceite qualquer lista que seja de Animal ou de pais de Animal (como Object)".
//• Por que a escrita funciona aqui? Como a lista é garantidamente de Animal ou de algo "maior" (como Object), o Java sabe que qualquer subclasse de Animal (como Cachorro ou Gato) cabe lá dentro. É a garantia do polimorfismo: qualquer Cachorro é um Object e é um Animal, então pode entrar.
//• O Problema da Leitura: Quando você tenta ler (get) dessa lista, você não recebe um Animal. Você recebe um Object. Por quê? Porque se a lista for List<Object>, o Java não pode garantir que o item que você pegou é um Animal



//• ? extends Animal: A lista pode ser List<Gato>. Se eu deixar entrar Cachorro, quebra a lista de gatos. Se eu deixar entrar Animal genérico, também quebra a lista de gatos. Bloqueia escrita para garantir que não entrem "irmãos" ou tipos incompatíveis.
//• ? super Animal: A lista é no mínimo de Animal (ou Object). Logo, qualquer Cachorro ou Gato cabe lá dentro, pois ambos são Animais. Libera escrita, mas na leitura só garante que é Object.