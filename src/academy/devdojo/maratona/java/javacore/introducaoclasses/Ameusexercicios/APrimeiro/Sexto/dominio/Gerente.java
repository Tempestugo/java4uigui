package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sexto.dominio;

public class Gerente extends Funcionario{

    @Override
    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salario: " + this.salario);
    }

    public Gerente(double salario, String nome) {
        super(salario, nome);
    }


}
