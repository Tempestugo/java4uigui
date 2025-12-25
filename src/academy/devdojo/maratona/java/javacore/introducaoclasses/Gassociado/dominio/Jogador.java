package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("Nome do jogador: " + this.nome);
        if (this.time != null) {
            System.out.println("Time: " + this.time.getNome());
        } else {
            System.out.println("Sem time");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
