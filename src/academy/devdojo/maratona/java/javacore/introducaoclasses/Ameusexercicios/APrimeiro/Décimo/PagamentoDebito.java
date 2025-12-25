package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Décimo;

public class PagamentoDebito implements FormaPagamento {
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
