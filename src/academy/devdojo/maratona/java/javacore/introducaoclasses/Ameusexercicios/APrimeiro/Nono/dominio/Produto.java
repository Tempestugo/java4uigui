package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Nono.dominio;

public class Produto {
    private String nome;
    private double preco;
    protected String categoria;


    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void imprimir(){
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(getCategoria());
    }

    public void aplicarDesconto(double percentual){
        setPreco(getPreco() - getPreco()*percentual);

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
