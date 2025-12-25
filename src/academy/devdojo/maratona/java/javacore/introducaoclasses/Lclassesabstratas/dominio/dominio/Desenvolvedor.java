package academy.devdojo.maratona.java.javacore.introducaoclasses.Lclassesabstratas.dominio.dominio;

public class Desenvolvedor  extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public void calculaBonus() {
        this.salario = this.salario + salario * 0.05;

    }

    @Override
    public String
    toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
