package academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.exercicios.dominio.dominio;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Gassociado.dominio.Jogador;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private Local local;

    public void imprimir(){
        if(nome==null){
            return;
        }
        System.out.println("Professor: " + nome);
        System.out.println("Especialidade: " + especialidade);
        if (this.nome == null || this.especialidade == null) return;

        else for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getNome());
        }
        System.out.println("----------------");
        System.out.println("----------------");


    }

    public Professor(String nome, String especialidade, Seminario[] seminarios)
    {
        this.nome=nome;
        this.especialidade=especialidade;
        this.seminarios=seminarios;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
