package academy.devdojo.maratona.java.javacore.introducaoclasses.Hheranca.dominio.dominio;

// não pode ter mais que um pai, mas pode ter um avô
public class Funcionario extends Pessoa {
//    private String nome;
//    private String cpf;
//    private String endereco;
    private double salario;

    static{
        System.out.println("Dentro do bloco estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco Funcionario");
    }
    {
        System.out.println("Dentro bloco Funcionario ");
    }



    //CTRL + O para criar o construtor para chamar o super

    public Funcionario(String nome, String cpf) {
        super();
        this.cpf = cpf;
        System.out.println("Dentro do bloco Funcionario");

    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: "+this.salario);

    }

    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome+" recebi o salario de"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
