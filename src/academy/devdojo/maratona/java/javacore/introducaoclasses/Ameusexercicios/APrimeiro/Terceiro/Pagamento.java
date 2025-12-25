package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Terceiro;

public abstract class Pagamento {
    private double valor;
    private String status;
    public StatusPagamento StatusPagamento;
    private double TaxaPagamento;


    public Pagamento(double valor, StatusPagamento StatusPagamento) {
        this.valor = valor;
        this.StatusPagamento = StatusPagamento;
    }

    public abstract void calcularTaxa();






    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTaxaPagamento() {
        return TaxaPagamento;
    }

    public void setTaxaPagamento(double taxaPagamento) {
        TaxaPagamento = taxaPagamento;
    }
}
