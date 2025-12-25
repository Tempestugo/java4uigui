package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Onze.dominio.dominio;

public interface Notificacao {
    void processarPagamento(String mensagem);
     int calcularCusto();
     TipoNotificacao retornarTipo();

}
