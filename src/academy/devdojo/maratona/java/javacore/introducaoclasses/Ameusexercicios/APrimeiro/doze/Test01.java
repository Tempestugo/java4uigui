package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.doze;

public class Test01 {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(TipoEnvio.NORMAL);
        Pedido p2 = new Pedido(TipoEnvio.EXPRESSO);
        Pedido p3 = new Pedido(TipoEnvio.INTERNACIONAL);

        p1.processar();
        p2.processar();
        p3.processar();
    }
}

