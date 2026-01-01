package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio;

import java.util.Objects;
public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Produto() {

    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco + " - estoque: " + estoque;
    }

    public boolean caro() {
        return this.preco > 200;
    }
    public void imprimir() {
        System.out.println(nome + " - R$ " + preco);
    }
}
