package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Décimo;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Terceiro.Pagamento;

import java.sql.SQLOutput;

public class PagamentoCredito implements FormaPagamento {
    private double valor;

    @Override
    public void processarPagamento(double valor) {
        this.valor = valor;
        calcularTaxa();
    }

    public void calcularTaxa() {
        this.valor = this.valor * 1.4;
    }

    @Override
    public TipoPagamento retornarTipoPagamento() {
        return TipoPagamento.CREDITO;
    }
}





