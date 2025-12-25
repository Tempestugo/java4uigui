package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Sétimo.dominio;

public class Loja {
    private Produto[] produtos;

    public Loja(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void meusProdutos() {
        System.out.println("======= LISTA DE PRODUTOS =======");
        for (Produto p : produtos) {
            System.out.println("Produto:  "+ p.getNome());

        }
    }

    public void aplicarProdutos() {
        System.out.println("======= APLICANDO EM PRODUTOS =======");
        for (Produto produto: produtos) {
            produto.setNome(" Bananão ");
            System.out.println("Produto:  "+ produto.getNome());

        }
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }
}
