package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Outros;

public class saque {

// Não usar ArithmeticException, crie a própria exceção
    public class Conta {
        private double saldo;

        public void sacar(double valor) {
            if (saldo <= 0) {
                throw new ArithmeticException("Saldo insuficiente");
            } else if (valor >= saldo) {
                throw new ArithmeticException("Saque maior que o saldo");
            } else if (valor < 0) {
                throw new ArithmeticException("Valores negativos não são permitidos aqui");
            } else if (valor == 0) {
                throw new ArithmeticException("Não é possível sacar 0 reais");

            }
        }
    }
}
