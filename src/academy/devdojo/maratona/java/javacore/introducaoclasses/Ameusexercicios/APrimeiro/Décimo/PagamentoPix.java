package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Décimo;

public class PagamentoPix implements FormaPagamento {
    private double valor;

    @Override
    public void processarPagamento(double valor) {
        this.valor = valor;
        calcularTaxa();
    }

    public void calcularTaxa() {
        this.valor = this.valor * 1.01;
    }

    @Override
    public TipoPagamento retornarTipoPagamento() {
        return TipoPagamento.CREDITO;
    }

}
