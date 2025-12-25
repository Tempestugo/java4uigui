package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.tryresourcers;

import java.io.Closeable;
import java.io.IOException;

public class ConexaoRemota implements Closeable {
        public void abrir() {
            System.out.println("Usando recurso");
        }

        @Override
        public void close() throws IOException {
            System.out.println("Fechando recurso");
        }



}

