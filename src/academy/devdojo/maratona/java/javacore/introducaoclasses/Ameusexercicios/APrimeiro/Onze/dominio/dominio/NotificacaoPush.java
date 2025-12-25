package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Onze.dominio.dominio;

import com.sun.nio.sctp.Notification;

public class NotificacaoPush implements Notificacao{
    public String mensagem;
    private double valor;

    @Override
    public void processarPagamento(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }

    @Override
    public int calcularCusto() {
        return 2;


    }

    @Override
    public TipoNotificacao retornarTipo() {
        System.out.println("Retornando tipo de notificacao");
        return TipoNotificacao.NOTIFICACAO_PUSH;
    }
}
