package academy.devdojo.maratona.java.javacore.introducaoclasses.BintroducaoMetodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;




    public void imprime(){
        System.out.printf(this.nome);
        System.out.print(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}

//Quando você faz:
//
//Estudante estudante = new Estudante();
//estudante.nome = "Hugo";
//
//
//O Java entende:
//
//        “Pegue este objeto específico chamado estudante”
//
//Dentro dele existe um atributo chamado nome.
//
//Dentro de métodos internos da classe, você pode escrever:
//
//        this.nome = nome;
//
//
//E significa:
//
//        this.nome = nome do atributo deste objeto
//
//        nome = parâmetro