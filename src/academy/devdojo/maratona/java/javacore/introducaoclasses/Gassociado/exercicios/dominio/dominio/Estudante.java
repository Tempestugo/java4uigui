package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.exercicios.dominio.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void imprimir()
    {
        if(nome==null){
            return;
        }
        System.out.println("----------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        String nomeSeminario = seminario != null ? seminario.getNome() : "Nenhum seminário cadastrado";
        System.out.println("Seminario: " + nomeSeminario);

        System.out.println("----------------");
    }


    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
