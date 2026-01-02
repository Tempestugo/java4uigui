package academy.devdojo.maratona.java.GestaoDeZoologico;

public abstract class  Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }


    public void  fazerBarulho(){
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
