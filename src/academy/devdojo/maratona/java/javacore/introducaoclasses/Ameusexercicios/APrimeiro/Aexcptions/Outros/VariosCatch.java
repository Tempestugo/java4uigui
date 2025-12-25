package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Outros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class VariosCatch {
    static void main(String[] args) throws IOException {


        try {
            processarArquivo();
        } catch (IOException e) {
            throw new NoSuchFileException("Erro ao ler arquivo");
        }

    }



    public static void processarArquivo() throws IOException {
        Files.readString(Path.of("dados.txt"));
    }

}
