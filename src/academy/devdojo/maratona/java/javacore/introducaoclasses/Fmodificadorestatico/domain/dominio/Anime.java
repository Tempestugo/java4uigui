package academy.devdojo.maratona.java.javacore.introducaoclasses.Fmodificadorestatico.domain.dominio;

public class Anime {
    private String genero;
    private static int[] episodios;
        // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1. Alocado espçao em memória pro objeto. Não é possivel inicializar variáveis de instãncia sem antes ter a classe (static)
    //2. Cada atributo de classe é criado e inicializado com valores default
    // ou o quer for passada
    //3.  Bloco de inicialização é executado
    // 4. Construtor é executado
    static {
        System.out.println("Dentro do Bloco de Inicialização");
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


        for(int episodio : Anime.episodios) {
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
