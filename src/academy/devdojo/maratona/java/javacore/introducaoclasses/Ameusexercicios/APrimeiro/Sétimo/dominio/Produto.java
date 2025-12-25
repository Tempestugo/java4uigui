package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sétimo.dominio;

public class Produto {
    protected String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
    }


    public void alterarPreco(double preco){
        this.preco = preco*2;
        System.out.println("Preco alterado agora é: " + this.preco);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
