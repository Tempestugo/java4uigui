package academy.devdojo.maratona.java.javacore.introducaoclasses.Bexercicios.dominio.dominio;

public class Carro {
        private String nome;
        private int ano;
        private double preco;

        public Carro(String nome, int ano, double preco) {
            this.nome = nome;
            this.ano = ano;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public int getAno() {
            return ano;
        }

        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return nome + " - " + ano + " - R$ " + preco;
        }
}
