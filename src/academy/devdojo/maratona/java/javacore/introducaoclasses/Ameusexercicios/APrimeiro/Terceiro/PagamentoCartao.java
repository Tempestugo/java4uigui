package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Terceiro;

public class PagamentoCartao extends Pagamento{




    public PagamentoCartao(double valor, StatusPagamento StatusPagamento) {
        super(valor, StatusPagamento);

    }

    @Override
    public void calcularTaxa() {
        double valor = this.getValor();
        setTaxaPagamento(0.05);
        valor  = getValor()  - getValor()  *  getTaxaPagamento();
        System.out.println("Valor a se pagar: " + valor);



    }



}
