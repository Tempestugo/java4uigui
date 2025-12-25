package academy.devdojo.maratona.java.javacore.introducaoclasses.Lclassesabstratas.dominio.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome,double salario) {
        super(nome,salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + salario * 0.02;
    }

}
