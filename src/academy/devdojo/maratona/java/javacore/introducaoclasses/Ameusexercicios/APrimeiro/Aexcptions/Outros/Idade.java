package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Aexcptions.Outros;

public class Idade {
    private String email;
    private int idade;


    public void cadastrarUsuario(String email, int idade) {
        if(email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email inválido, preencha");
            //Regra de negócio, pois o usuário pode esquecer de colocar


        }else if(idade < 18){

            throw new IllegalArgumentException("Menores de 18 anos não são permitidos");

        }

    }

}
//Regras:
//
//        - Email não pode ser nulo
//- Idade mínima: 18
//
//        **Tarefa:**
//
//        1. Decida onde usar `throw new`.
//        2. Classifique cada erro como:
//        - bug?
//        - negócio?
//        3. Não use `try-catch` aqui.