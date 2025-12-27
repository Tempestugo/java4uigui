package academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.service;

import java.util.List;

public class RentalService<T> {


    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }


        public T buscarObjetoDisponivel(){
            System.out.println("Buscando objeto disponivel...");
            T t = objetosDisponiveis.remove(0);
            System.out.printf("objeto disponivel: %s\n", t);
            System.out.println("objetos disponíveis para alugar: ");
            System.out.println(objetosDisponiveis);
            return t;
        }

        public void retornarObjetoAlugado(T T){
            System.out.println("Devolvendo objeto "+T);
            objetosDisponiveis.add(T);
            System.out.println("Objetos disponiveis para alugar: ");
            System.out.println(objetosDisponiveis);

        }
}
