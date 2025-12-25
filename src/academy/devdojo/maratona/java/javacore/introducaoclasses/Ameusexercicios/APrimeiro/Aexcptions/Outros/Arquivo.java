package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Outros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;






public class Arquivo {
    public class ErroAoLerConfiguracaoException extends Exception {
        public ErroAoLerConfiguracaoException(String msg) {
            super(msg);


        }
        public ErroAoLerConfiguracaoException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

    public void ErroAoLerConfiguracao(String msg) {
        try {
        Files.writeString(
                Path.of("config.txt"),
                msg + System.lineSeparator(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
        } catch (
        IOException e) {



        }
    }
    public class ConfiguracaoInvalidaException extends RuntimeException {

        public ConfiguracaoInvalidaException(String mensagem) {
            super(mensagem);
        }
    }

    public class ConfiguracaoService{
        public void carregarModo(String msg){
            try {
                Files.readString(Path.of("config.txt"));
            } catch (IOException e) {
                e.printStackTrace();

            }

        }

    }


    }





