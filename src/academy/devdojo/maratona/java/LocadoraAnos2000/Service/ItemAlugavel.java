package academy.devdojo.maratona.java.LocadoraAnos2000.Service;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class ItemAlugavel {
    private Long id;
    private String titulo;
    private LocalDateTime dataLancamento;
    private double preco;

    // Construtor para obrigar quem herdar a passar esses dados
    public ItemAlugavel(Long id, String titulo, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
        this.dataLancamento = LocalDateTime.now();
    }



    // Getters
    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public double getPreco() { return preco; }

    // O toString ajuda muito na hora de imprimir
    @Override
    public String toString() {
        return "ID: " + id + " | Título: " + titulo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ItemAlugavel that = (ItemAlugavel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}