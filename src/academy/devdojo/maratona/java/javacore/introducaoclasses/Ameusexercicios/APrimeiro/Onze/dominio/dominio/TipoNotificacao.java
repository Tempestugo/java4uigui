package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Onze.dominio.dominio;

public enum TipoNotificacao {
    NOTIFICACAO_EMAIL("Notificação de EMAIL",2000),
    NOTIFICACAO_SMS("Notificação SMS",3000),
    NOTIFICACAO_PUSH("Notificação PUSH",900);


    private final String descricao;
    private final int codigoNum;


    TipoNotificacao(String descricao, int codigoNum) {
        this.descricao = descricao;
        this.codigoNum = codigoNum;
    }

}
