package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sexto.dominio;

public class Funcionario {
    protected double salario;
    protected String nome;


    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }
    public void aumentarSalario(){

    }

    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
