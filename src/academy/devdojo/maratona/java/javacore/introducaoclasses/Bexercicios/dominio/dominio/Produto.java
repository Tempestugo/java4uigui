package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio;

import java.util.Objects;

public class Produto {
    String  nome;
    double preco;
    Long id;

    public Produto(String nome, double preco, Long id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
