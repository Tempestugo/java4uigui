package academy.devdojo.maratona.java.LocadoraAnos2000.Dominio;

import academy.devdojo.maratona.java.LocadoraAnos2000.Service.ItemAlugavel;

import java.time.LocalDateTime;
import java.util.Objects;

public class Jogo extends ItemAlugavel {

    private String autor;

    public Jogo(Long id, String titulo, double preco, String autor) {
        super(id, titulo, preco);

        this.autor = autor;
    }
}