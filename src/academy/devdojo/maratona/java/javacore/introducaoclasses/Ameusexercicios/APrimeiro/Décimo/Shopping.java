package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Décimo;

public class Shopping {
    static void main(String[] args) {
        Compra pagCredito = new Compra(new PagamentoCredito());
        pagCredito.processarPagamento(0.5);




    }
}
