package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Outros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LogApplication {


    public static class ErroAoSalvarLogException extends RuntimeException {

        public ErroAoSalvarLogException(String mensagem) {
            super(mensagem);
        }

        public ErroAoSalvarLogException(String mensagem, Throwable causa) {
            super(mensagem, causa);
        }
    }

    public class LogService {

        public static void salvarLog(String texto) {
            try {
                Files.writeString(
                        Path.of("app.log"),
                        texto + System.lineSeparator(),
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND
                );
            } catch (IOException e) {
                throw new ErroAoSalvarLogException("Falha ao salvar log", e);
            } finally {
                System.out.println("Tentativa de salvar log finalizada");
            }
        }
    }
}
