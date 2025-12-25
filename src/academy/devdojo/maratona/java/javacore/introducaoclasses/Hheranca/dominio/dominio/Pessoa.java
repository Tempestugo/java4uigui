package academy.devdojo.maratona.java.javacore.introducaoclasses.Hheranca.dominio.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco estático de pessoa");
    }
    {
        System.out.println("Dentro do bloco inicialização1");
    }
    {
        System.out.println("Dentro bloco inci pesoa");
    }


    public void imprime(){
        System.out.println("Nome : " + this.nome);
        System.out.println("CPF : " + this.cpf);
        System.out.println("Endereco : " + this.endereco.getRua()+" "+this.endereco.getCep());

    }

    public Pessoa() {
        System.out.println("Dentro da pessoa");
        this.nome = nome;
    }
    public Pessoa(String nome, String cpf) {
        this();
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
