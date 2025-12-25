package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Décimo;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Terceiro.Pagamento;

public class Compra {
    private FormaPagamento formaPagamento;

    public Compra(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void processarPagamento(double valor) {
        formaPagamento.processarPagamento(valor);
        System.out.println("Pagamento via: " + formaPagamento.retornarTipoPagamento());
    }
}


