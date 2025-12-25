package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Nono.dominio;

public class Pedido {
    private Produto[] produtos;
    private double total;

    public Pedido(Produto[] produtos) {
        this.produtos = produtos;

    }

    public void listarProdutos(){
        if(produtos==null){
            return;
        }
        for (Produto produto : produtos) {
            System.out.println("O nome do produto é: "+produto.getNome());
            System.out.println("O preço do produto é: "+produto.getPreco());
        }
    }
    public void aplicarDescontoPedido(double percentual){
        for (Produto produto : produtos) {
            produto.aplicarDesconto(percentual);
        }
    }

    public void calcularTotal(){
        if(produtos==null){
            return;
        }
        for (Produto produto : produtos) {
            total += produto.getPreco();

        System.out.println(total);


        }
    }
}
