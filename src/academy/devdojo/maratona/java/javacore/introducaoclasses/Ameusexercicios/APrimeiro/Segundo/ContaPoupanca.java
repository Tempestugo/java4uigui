package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Segundo;

public class ContaPoupanca {
    private double saldo;
    private int numeroConta;

    public static  double taxaJurosAnual = 0.2;

    {
        System.out.println("Configurando sistema bancário...");
    }

    public ContaPoupanca() {
        this.numeroConta = 0000;
        this.saldo = 0.0;
    }

    public ContaPoupanca(double saldoInicial) {
        this();
        this.saldo = saldoInicial;
    }

    public ContaPoupanca(int numeroConta, double saldoInicial) {
        this(saldoInicial);
        this.numeroConta = numeroConta;
    }




    public static double alterarTaxaJuros(double taxaJuros) {
        return taxaJurosAnual = taxaJuros*2;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if  (saldo < 0){
            System.out.println("Saldo negativo");
            return;
        }
        this.saldo = saldo;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
