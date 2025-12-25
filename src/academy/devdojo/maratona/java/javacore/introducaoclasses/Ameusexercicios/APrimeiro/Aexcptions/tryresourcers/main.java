package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.tryresourcers;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try (ConexaoRemota r = new ConexaoRemota()) {
            r.abrir();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
