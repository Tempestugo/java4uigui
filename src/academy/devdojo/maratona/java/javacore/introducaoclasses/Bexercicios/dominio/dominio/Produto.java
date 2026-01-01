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

    public Produto(Produto produto) {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(preco);
    }
}
