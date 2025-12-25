package academy.devdojo.maratona.java.javacore.introducaoclasses.Kenumeracoes.test;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Kenumeracoes.dominio.Cliente;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Kenumeracoes.dominio.Pagamento;
import academy.devdojo.maratona.java.javacore.introducaoclasses.Kenumeracoes.dominio.TipoCliente;
import  academy.devdojo.maratona.java.javacore.introducaoclasses.Kenumeracoes.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Hugo",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Pedro",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));


        Pagamento pagamento = new Pagamento(TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(pagamento);
        pagamento.tipoPagamento();
        TipoCliente tipoCliente2 = TipoCliente.tipoCLienteporNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);

    }
}
