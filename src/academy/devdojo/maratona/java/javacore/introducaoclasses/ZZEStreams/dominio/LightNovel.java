package academy.devdojo.maratona.java.javacore.introducaoclasses.ZZEStreams.dominio;

public class LightNovel {
    private String nome;
    private double price;
    private Category category;

    public LightNovel(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public LightNovel(String nome, double price, Category category) {
        this.nome = nome;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {

        return category;
    }
}

