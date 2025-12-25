package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Nono.dominio;

public class ProdutoImportado extends Produto {
    private double taxa = 0.2;
    private double percentual;

    public ProdutoImportado(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public void aplicarDesconto(double taxa) {
        setPreco(getPreco() + getPreco()*taxa);
        super.aplicarDesconto(percentual);
    }

}
