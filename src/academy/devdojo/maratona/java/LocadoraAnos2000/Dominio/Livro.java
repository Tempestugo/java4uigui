package academy.devdojo.maratona.java.LocadoraAnos2000.Dominio;

import academy.devdojo.maratona.java.LocadoraAnos2000.Service.ItemAlugavel;

import java.time.LocalDateTime;

public class Livro extends ItemAlugavel {


    private String autor;

    public Livro(Long id, String titulo, double preco, String autor) {
        super(id, titulo, preco);

        this.autor = autor;
    }
}