package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.exercicios.dominio.dominio;

public class Seminario {
    private String nome;
    private Estudante[] estudantes;
    private Local local;

    public void imprimir()
    {
        if(nome==null){
            return;
        }
        System.out.println("Nome do Seminário: " + nome);
        System.out.println("Nome do Local : " + local.getNome());;
        for (Estudante estudante : estudantes) {
            System.out.println("Professor: "+estudante.getNome());

        }
        System.out.println("----------------");
        System.out.println("----------------");


    }


    public Seminario(String nome,  Estudante[] estudantes, Local local) {
        this.nome = nome;
        this.estudantes = estudantes;
        this.local = local;


    }




    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
