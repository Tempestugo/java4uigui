package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Terceiro;

public class PagoTest01 {
    public static void main(String[] args) {
        PagamentoCartao pagamentoCartao = new PagamentoCartao(20,StatusPagamento.PENDENTE);
        PagamentoPix pagamentoPix = new PagamentoPix(3000,StatusPagamento.APROVADO);

        pagamentoCartao.calcularTaxa();
        pagamentoPix.calcularTaxa();


    }
}
