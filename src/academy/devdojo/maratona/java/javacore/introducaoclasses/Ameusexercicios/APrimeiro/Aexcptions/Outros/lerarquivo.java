package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Outros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class lerarquivo {
    public static void main(String[] args) throws IOException {
        try {
            carregarConfiguracao();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    public static String carregarConfiguracao() throws IOException {
        return Files.readString(Path.of("config.txt"));
    }
}
