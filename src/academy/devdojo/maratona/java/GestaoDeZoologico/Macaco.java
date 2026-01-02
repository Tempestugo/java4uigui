package academy.devdojo.maratona.java.GestaoDeZoologico;

public class Macaco extends Animal{
    public Macaco(String nome) {
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O macaco mia!");
    }

}
