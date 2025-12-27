package academy.devdojo.maratona.java.javacore.introducaoclasses.ZgenericsA.test;



abstract class Animal {
    public abstract void consulta();
}
class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando doguinho");
    }


}
class Gato2 extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class WildcardTest01 {
    static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato2[] gatos = {new Gato2(), new Gato2()};
        printConsulta(cachorros);
        printConsulta(gatos);
        Animal[] animals = {new Cachorro(), new Gato2()};
        printConsulta(animals);

    }
    private static void printConsulta(Animal[] animais) {
        for (Animal animal : animais) {
            animal.consulta();
        }
//        animais[1] = new Gato2();
    }
}
