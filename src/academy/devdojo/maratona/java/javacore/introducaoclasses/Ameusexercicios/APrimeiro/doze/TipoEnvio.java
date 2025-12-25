package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.doze;

public enum TipoEnvio {
        NORMAL("Normal",1),
        EXPRESSO("Expresso",2),
        INTERNACIONAL("Internacional",3);


    private final String descricao;
    private final int codigoNum;


    TipoEnvio(String descricao, int codigoNum) {
        this.descricao = descricao;
        this.codigoNum = codigoNum;
    }

    public int getCodigoNum() {
        return codigoNum;
    }


    public String getDescricao() {
        return descricao;
    }
}





