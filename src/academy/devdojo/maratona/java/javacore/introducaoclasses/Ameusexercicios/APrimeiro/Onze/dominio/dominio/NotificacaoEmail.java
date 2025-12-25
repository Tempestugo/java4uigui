package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Onze.dominio.dominio;

public class NotificacaoEmail implements Notificacao {
    public String mensagem;

    @Override
    public void processarPagamento(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }

    @Override
    public int calcularCusto() {
        return 3;

    }

    @Override
    public TipoNotificacao retornarTipo() {
        System.out.println("Retornando tipo de notificacao");
        return TipoNotificacao.NOTIFICACAO_EMAIL;
    }
}
