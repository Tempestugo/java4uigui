package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.treze;

public enum TipoRelatorio {
    PDF("Arquivo PDF",1),
    CSV("Arquivo CSV",2),
    HTML("Arquivo HTML",3);

    private final String descricao;
    private final int codigoNum;

    // Construtor privado para inicializar a descrição
    TipoRelatorio(String descricao, int codigoNum) {
        this.descricao = descricao;
        this.codigoNum = codigoNum;
    }

}

