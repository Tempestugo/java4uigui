package academy.devdojo.maratona.java.javacore.introducaoclasses.Ameusexercicios.APrimeiro.Quarto;

public class ClinicaVeterinaria {


    public void examinar(Animal animal){
        animal.emitirSom();

        if (animal instanceof Gato) {
            System.out.println("É um gato");
        } else if (animal instanceof Cachorro) {
            System.out.println("É um cachorro");
        }
    }


    static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        ClinicaVeterinaria cv = new ClinicaVeterinaria();

        cv.examinar(cachorro);
        cv.examinar(gato);

        cv.examinar(cachorro);
        cv.examinar(gato);

    }

}

