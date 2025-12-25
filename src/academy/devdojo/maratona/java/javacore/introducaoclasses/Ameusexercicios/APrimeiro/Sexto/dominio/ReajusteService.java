package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sexto.dominio;

public class ReajusteService{
    public  void reajustarSalarioPrimitivo(double valor){
        valor = valor * 1.1;
    }


    public void reajustarSalarioObjeto(Funcionario func){
        func.salario = func.salario * 1.1;
    }


}
