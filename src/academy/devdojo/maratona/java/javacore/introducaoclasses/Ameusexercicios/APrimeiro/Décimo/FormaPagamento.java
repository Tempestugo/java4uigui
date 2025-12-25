package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Décimo;

public interface FormaPagamento {
    public void calcularTaxa();
    void processarPagamento(double valor);
    TipoPagamento retornarTipoPagamento();
}
