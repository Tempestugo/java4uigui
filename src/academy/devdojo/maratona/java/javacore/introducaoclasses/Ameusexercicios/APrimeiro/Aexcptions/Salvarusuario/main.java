package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Salvarusuario;

public class main {
    public static void main(String[] args) {

        UsuarioService usuarioService = new UsuarioService();

        try {
            usuarioService.cadastrarUsuario(
                    "João",
                    "joao@email",
                    20
            );
            System.out.println("Usuário cadastrado com sucesso!");

        } catch (UsuarioInvalidoException e) {
            // ERRO DE NEGÓCIO
            System.out.println("Erro de validação: " + e.getMessage());

        } catch (ErroAoSalvarUsuarioException e) {
            // ERRO TÉCNICO
            System.out.println("Erro interno do sistema");
            e.printStackTrace(); // log
        }
    }
}
