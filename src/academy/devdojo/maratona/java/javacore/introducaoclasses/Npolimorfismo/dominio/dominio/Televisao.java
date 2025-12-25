package academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTRO = 0.3;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto Televisao");
        return this.valor * IMPOSTO_POR_CENTRO;
    }
}
