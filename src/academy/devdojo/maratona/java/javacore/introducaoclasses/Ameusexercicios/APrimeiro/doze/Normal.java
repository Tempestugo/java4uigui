package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.doze;

public class Normal implements MetodoEnvio {
    double valor = 5;



    public double custoEnvio() {
        this.valor = valor;
        return this.valor;
    }

    @Override
    public TipoEnvio retornarTipoEnvio() {
        return TipoEnvio.NORMAL;
    }

}
