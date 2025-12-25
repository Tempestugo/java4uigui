package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Terceiro;

public class PagamentoPix extends Pagamento{

    public PagamentoPix(double valor, StatusPagamento status) {
        super(valor, status);

    }


    @Override
    public void calcularTaxa() {
        double valor = this.getValor();
        setTaxaPagamento(0.01);
        valor  = getValor()  - getValor()  *  getTaxaPagamento();

        System.out.println("Valor a se pagar: " + valor);


    }

}
