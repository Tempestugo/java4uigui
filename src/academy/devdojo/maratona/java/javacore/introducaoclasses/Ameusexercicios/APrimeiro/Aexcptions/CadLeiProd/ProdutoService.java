package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.CadLeiProd;

import academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Salvarusuario.ErroAoSalvarUsuarioException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ProdutoService {


    public void cadastrarProduto(String nome, double preco, int quantidade) throws ErroAoAcessarProdutoException {


        if (preco <= 0) {
            throw new ProdutoInvalidoException("Preço inválido");
        }
        if (nome == null || nome.isEmpty()) {
            throw new ProdutoInvalidoException("Nome inválido");
        }
        if (quantidade <= 0) {
            throw new ProdutoInvalidoException("Quantidade inválida");
        }


        String linha = String.format(
                "%s;%s;%d%n",
                nome,
                preco,
                quantidade
        );

        try {
            Files.writeString(
                    Path.of("produtos.csv"),
                    linha,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new ErroAoAcessarProdutoException(e.getMessage(), e);

        }




    }


    public List<String> listarProdutos() throws ErroAoAcessarProdutoException {
        try {
            return Files.readAllLines(Path.of("produtos.csv"));
        } catch (IOException e) {
            throw new ErroAoAcessarProdutoException(
                    "Erro ao acessar a lista de produtos",
                    e
            );
        }
    }

}







