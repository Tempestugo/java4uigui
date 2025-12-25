package academy.devdojo.maratona.java.javacore.introducaoclasses.Npolimorfismo.dominio.dominio;

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTRO = 0.3;


    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Computador calcularImposto");
        return this.valor * IMPOSTO_POR_CENTRO;
    }


}
