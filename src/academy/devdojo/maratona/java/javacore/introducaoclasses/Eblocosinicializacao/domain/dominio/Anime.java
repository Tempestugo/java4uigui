package academy.devdojo.maratona.java.javacore.introducaoclasses.Eblocosinicializacao.domain.dominio;

public class Anime {
    private String genero;
    private int[] episodios;

    // 1. Alocado espçao em memória pro objeot
    //2. Cacd atributo de classe é criado e inicializado com valores default
    // ou o quer for passada
    //3.  Bloco de inicialização é executado
    // 4. Construtor é executado
    {
        System.out.println("Anime inicializado");
        // bloco de inicialização
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.genero = nome;
    }

    public Anime() {


        for(int episodio : this.episodios) {
            System.out.println(episodio +" ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }
}
