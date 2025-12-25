package academy.devdojo.maratona.java.javacore.introducaoclasses.construtores.dominio.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;



    // Construtor principal
    public Anime(String nome, String tipo, int episodios, String genero) {
        this(); // chama o construtor padrão
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    // Construtor padrão
    public Anime() {
        System.out.println("Construtor vazio chamado");
    }
    // Sobrecarga com estudio
    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero); // chama o anterior
        this.estudio = estudio;
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }


//    public void init(String tipo, int episodios,  String nome) {
//        this.tipo = tipo;
//        this.episodios = episodios;
//        this.nome = nome;
//        this.genero = genero;
//    }
//
//    public void init2(String tipo, int episodios, String nome, String genero) {
//        this.tipo = tipo;
//        this.episodios = episodios;
//        this.nome = nome;
//        this.genero = genero;
//    }
//
//    public void init(String tipo, int episodios, String nome, String genero) {
//        this.init(tipo, episodios, nome);
//        this.genero = genero;
//    }






    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;

    }
    public int getEpisodios(){
        return this.episodios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
