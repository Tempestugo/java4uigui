package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.doze;

public class Internacional implements MetodoEnvio {
    double valor = 10;
    double taxa = 20;



    public double custoEnvio() {
        this.valor = valor + taxa;
        return this.valor;
    }

    public TipoEnvio retornarTipoEnvio() {
        return TipoEnvio.EXPRESSO;
    }

}
