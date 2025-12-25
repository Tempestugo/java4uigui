package academy.devdojo.maratona.java.javacore.introducaoclasses.Fmodificadorestatico.domain.dominio;

public class Carro {
    private String nome;
    private static double velocidademaxima;
    private static double  velocidadeLimite = 250;

    public Carro(String nome, double velocidademaxima) {
        this.nome = nome;
        this.velocidademaxima = velocidademaxima;
    }


    public void imprime(){
        System.out.println("---------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade maxima: "+this.velocidademaxima);
        System.out.println("Velocidade limite: "+Carro.velocidadeLimite);

    }

    public static void setVelocidadeLimite(double velocidademaxima) {
       // Isso aqui não existe, this não faz sentido
        Carro.velocidadeLimite = velocidadeLimite;
        // this se refere ao objeto

    }


    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    //  return velocidadeLimite;   não tem outra variável local com a mesma variavé, então não precisa do "Carro"

    }





    public double getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(double velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
