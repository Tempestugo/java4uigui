package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.doze;

public class Expresso implements MetodoEnvio {
    double valor = 10;



    public double custoEnvio() {
        this.valor = valor;
        return this.valor;

    }

    public TipoEnvio retornarTipoEnvio() {
        return TipoEnvio.EXPRESSO;
    }

}
