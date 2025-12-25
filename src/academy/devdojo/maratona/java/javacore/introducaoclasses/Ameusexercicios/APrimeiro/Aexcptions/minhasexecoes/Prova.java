package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.minhasexecoes;

public class Prova {
    public static void main(String[] args)  {
        Logica logica = new Logica();
        String modo;

        try {
            modo = logica.carregarModo();

        } catch (ErroAoLerConfiguracaoException e) {
            e.printStackTrace();
            System.out.println("Tivemos um erro!");

        } catch (ConfiguracaoInvalidaException e) {
            System.out.println("Tivemos um erro de negócio!");
        }


    }

}
