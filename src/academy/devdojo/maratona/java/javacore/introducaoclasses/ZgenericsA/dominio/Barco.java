package academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.dominio;

public class Barco {
    private String nome;


    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
