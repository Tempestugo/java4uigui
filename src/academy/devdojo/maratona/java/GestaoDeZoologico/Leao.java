package academy.devdojo.maratona.java.GestaoDeZoologico;

public class Leao extends Animal{
    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O leão ruge!");
    }

}
