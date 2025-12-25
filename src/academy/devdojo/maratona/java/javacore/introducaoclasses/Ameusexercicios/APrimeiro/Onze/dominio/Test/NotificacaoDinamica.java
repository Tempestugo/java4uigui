package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Onze.dominio.Test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Onze.dominio.dominio.*;

public class NotificacaoDinamica {
    public static void main(String[] args) {
        Notificacao email = new NotificacaoEmail();
        Notificacao push = new NotificacaoPush();
        Notificacao sms = new NotificacaoSMS();
        CentralNotificacoes central = new CentralNotificacoes(email);
        CentralNotificacoes central2 = new CentralNotificacoes(push);
        CentralNotificacoes central3 = new CentralNotificacoes(sms);

        central.calcularCusto(10);
        central2.calcularCusto(10);
        central3.calcularCusto(10);
        System.out.println("=================================");

        central.imprimir("EMAIL");
        central2.imprimir("PUSH");
        central3.imprimir("SMS");


        System.out.println("=================================");


        email.calcularCusto();
        push.calcularCusto();
        sms.calcularCusto();

        System.out.println("=================================");

        email.retornarTipo();
        push.retornarTipo();
        sms.retornarTipo();

        System.out.println("=================================");

        email.processarPagamento("EMAIL");
        push.processarPagamento("PUSH");
        sms.processarPagamento("SMS");





    }
}
