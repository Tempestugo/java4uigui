package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.minhasexecoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Logica {
    public String carregarModo() throws ErroAoLerConfiguracaoException {
        String conteudo;

        try {
            conteudo = Files.readString(Path.of("config.txt"));
        } catch (IOException e) {
            // ERRO TÉCNICO → traduz e passa a causa
            throw new ErroAoLerConfiguracaoException(
                    "Erro ao ler arquivo de configuração", e
            );
        }


        if (conteudo.isEmpty() || !conteudo.isBlank() || !conteudo.startsWith("Dev")) {
            throw new ConfiguracaoInvalidaException("Configuração Inválida");



        }
    return conteudo;
    }


}
