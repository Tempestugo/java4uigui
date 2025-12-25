package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Segundo;

import static academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Segundo.ContaPoupanca.taxaJurosAnual;

public class ContaTest01 {
    public static void main(String[] args) {
        ContaPoupanca contaPoupana = new ContaPoupanca(2030,2000);

        System.out.println(ContaPoupanca.alterarTaxaJuros(10));
        System.out.println(taxaJurosAnual);

        System.out.println("Saldo é de: "+contaPoupana.getSaldo());
        System.out.println("Numero de conta é: "+contaPoupana.getNumeroConta());
    }
}
