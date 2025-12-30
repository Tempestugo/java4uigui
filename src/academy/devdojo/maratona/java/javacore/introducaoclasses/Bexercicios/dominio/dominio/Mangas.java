package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio;

import java.util.Objects;

public class Mangas implements Comparable<Mangas> {
    private String nome;
    private Long id;
    private double preco;


    public Mangas(String nome, Long id, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mangas mangas = (Mangas) o;
        return Objects.equals(id, mangas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



    @Override
    public int compareTo(Mangas o) {
        return String.CASE_INSENSITIVE_ORDER.compare(nome, o.nome);
    }
}
