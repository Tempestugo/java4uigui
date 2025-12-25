package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Onze.dominio.dominio;

public class CentralNotificacoes {
    private Notificacao notificacaos;

    public CentralNotificacoes(Notificacao notificacaos) {
        this.notificacaos = notificacaos;
    }

    public void imprimir(String mensagem) {
        notificacaos.processarPagamento(mensagem);
        System.out.println("Notificação de: "+notificacaos.retornarTipo());

    }

    public void calcularCusto(double valor) {
        notificacaos.calcularCusto();


    }


}
