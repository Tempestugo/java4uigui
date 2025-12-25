package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Salvarusuario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class UsuarioService {

        public void cadastrarUsuario(String nome, String email, int idade)
                throws ErroAoSalvarUsuarioException {

            // REGRA DE NEGÓCIO
            if (nome == null || nome.isBlank()) {
                throw new UsuarioInvalidoException("Nome é obrigatório");
            }

            if (email == null || !email.contains("@")) {
                throw new UsuarioInvalidoException("Email inválido");
            }

            if (idade < 18) {
                throw new UsuarioInvalidoException("Usuário deve ser maior de idade");
            }

            // PARTE TÉCNICA
            String linha = String.format(
                    "%s;%s;%d%n",
                    nome,
                    email,
                    idade
            );

            try {
                Files.writeString(
                        Path.of("usuarios.csv"),
                        linha,
                        StandardOpenOption.CREATE,
                        StandardOpenOption.APPEND
                );
            } catch (IOException e) {
                throw new ErroAoSalvarUsuarioException(
                        "Erro ao salvar usuário no arquivo",
                        e
                );
            }
        }
    }