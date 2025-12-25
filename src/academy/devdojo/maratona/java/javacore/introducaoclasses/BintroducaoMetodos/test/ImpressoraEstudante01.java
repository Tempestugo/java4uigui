package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.test;


import academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio.Estudante;

public class ImpressoraEstudante01 {
    public void imprime(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);



    }
}

/*



/*Classe = projeto

Objeto = produto real do projeto

new = cria o objeto na memória

Variável (estudante) = ponteiro para o objeto

imprime(Estudante estudante) = método que recebe um objeto para trabalhar

Você não pode aplicar o método a atributos soltos; ele precisa do objeto inteiro
 */