package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Décimo;

public enum TipoPagamento {
    CREDITO("CREDITO",1929),
    DEBITO("DÉBITO",2020),
    PIX("PIX",1000);

    private final String descricao;
    private final int codigoNum;

    // Construtor privado para inicializar a descrição
    TipoPagamento(String descricao, int codigoNum) {
        this.descricao = descricao;
        this.codigoNum = codigoNum;
    }




}
