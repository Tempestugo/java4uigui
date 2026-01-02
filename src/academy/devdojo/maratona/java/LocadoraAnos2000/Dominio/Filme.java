package academy.devdojo.maratona.java.LocadoraAnos2000.Dominio;

import academy.devdojo.maratona.java.LocadoraAnos2000.Service.ItemAlugavel;

public class Filme extends ItemAlugavel {


    private String autor;

    public Filme(Long id, String titulo, double preco, String autor) {

        super(id, titulo, preco);

        this.autor = autor;
    }
}