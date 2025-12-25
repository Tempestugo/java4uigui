package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.doze;

public class Pedido {
    private MetodoEnvio metodoEnvio;

    public Pedido(TipoEnvio tipoEnvio) {
        this.metodoEnvio = FabricaMetodoEnvio.criar(tipoEnvio);
    }

    public void processar() {
        double custo = metodoEnvio.custoEnvio();
        System.out.println("Envio: " + metodoEnvio.retornarTipoEnvio());
        System.out.println("Custo: " + custo);
    }
    public class FabricaMetodoEnvio {
        public static MetodoEnvio criar(TipoEnvio tipoEnvio) {
            switch (tipoEnvio) {
                case NORMAL: return new Normal();
                case EXPRESSO: return new Expresso();
                case INTERNACIONAL: return new Internacional();
                default: throw new IllegalArgumentException();
            }
        }
    }
}



