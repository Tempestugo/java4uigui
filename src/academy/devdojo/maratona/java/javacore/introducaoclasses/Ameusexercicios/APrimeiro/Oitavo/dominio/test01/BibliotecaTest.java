package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Oitavo.dominio.test01;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Oitavo.dominio.dominio.Biblioteca;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Oitavo.dominio.dominio.Livro;

public class BibliotecaTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro Princesa", 2220.00,"Magia");
        Livro livro2 = new Livro("Livro Macarrao", 500.00,"Magia");
        Livro livro3 = new Livro("Livro Boris", 100.00,"História");

        Livro livros[] = new Livro[]{livro1,livro2,livro3};
        System.out.println("======================================");

        Biblioteca biblioteca = new Biblioteca(livros);
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
        System.out.println("======================================");

        biblioteca.aplicarDescontoEmTodos(0.5);

        System.out.println("======================================");
        biblioteca.buscarPorCategoria("Magia");



    }
}
